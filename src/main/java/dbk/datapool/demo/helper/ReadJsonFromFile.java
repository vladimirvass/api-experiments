package dbk.datapool.demo.helper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;
import dbk.datapool.demo.helper.databinding.models.testdata.TestDataSetJSON;
import ie.msg.products.databinding.icm.ICMRoot;
import ie.msg.products.databinding.pim.PIMProductItem;
import net.minidev.json.JSONArray;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class for different approaches when reading or parsing json file
 * @author vlad vasilev
 */
public class ReadJsonFromFile {

    private final ObjectMapper mapper = new ObjectMapper();

    /**
     * Read json from string source
     * @param fileName json file for processing
     * @return JsonNode which represents the root of json document.
     * Possible returned instances can be JsonObjects, JsonArrays, TextNode, IntNode
     */
    public JsonNode readJsonFileAsString(String fileName) {
        try {
            return mapper.readTree(SourceData.asString(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * Obtaining particular price by providing a giving product sku
     * @param fileName   Desired json file where resides test data
     * @param productSku The sku of desired product
     * @return selling price as BigDecimal
     */
    public BigDecimal getProductPriceFromJSON(String fileName, String productSku) {
        JSONArray dataObject = JsonPath
                .parse(SourceData.asString(fileName))
                .read(buildJsonPathForSellPrice(productSku));
        return new BigDecimal(dataObject.get(0).toString());
    }


    /**
     * Obtaining all ICM Product SKUs from a given json file
     * @param fileName Desired json file where resides test data
     * @return ICM product SKUs price as BigDecimal
     */
    public List<Object> getAllSKUsFromICMJSON(String fileName) {

        return JsonPath
                .parse(SourceData.asString(fileName))
                .<JSONArray>read("$..product..sku");
    }


    /**
     * Obtaining all PIM Product SKUs from a given json file
     * @param source Desired json file where resides test data
     * @return PIM product SKUs price as BigDecimal
     */
    public List<Object> getAllSKUsFromPIMJSON(String source) {

        return JsonPath
                .parse(SourceData.asString(source))
                .<JSONArray>read("$..[?(@['MWP Sellable'] == 'Yes' && " +
                        "@.Status != 'Inactive' && " +
                        "@.Status != '' &&  " +
                        "@['Online Retail'] == 'Yes' || " +
                        "@['Online Marketplace Del'] == 'Yes' ||  " +
                        "@['Online Marketplace Col'] == 'Yes' || " +
                        "@['Online Foodservice'] == 'Yes')].['MWP Article Code']");
    }


    /**
     * Comparing two Lists of strings
     * @param listOne The first list of objects provided for comparison
     * @param listTwo The second list of objects
     * @return Different elements from the second list
     */
    public List<Object> getDifferencesBetweenTwoCollections(List<Object> listOne, List<Object> listTwo) {
        return listOne.stream()
                .filter(element -> !listTwo.contains(element))
                .collect(Collectors.toList());
    }


    //TODO: Do it to be more flexible!! Now is hardcoded for selling-price

    /**
     * Dynamically build jsonPath for extracting product selling-price by providing sku
     * @param productSku The sku of desired product
     * @return jsonPath as string
     */
    public String buildJsonPathForSellPrice(String productSku) {
        return String.format("$..variants[?(@.sku==%s)].selling-price", productSku);
    }


    /**
     * Convert json to java object
     * @param fileName json file for processing
     * @return TestDataSetJSON object for further usage
     */
    public TestDataSetJSON readJsonFileAsObject(String fileName) {
        TestDataSetJSON dataSetObject = null;
        try {
            dataSetObject = mapper.readValue(SourceData.asString(fileName), TestDataSetJSON.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataSetObject;
    }


    /**
     * Convert json to java object
     * @param fileName json file for processing
     * @return ICMRoot (the wrapper of Intershop product export json) object for further usage
     */
    public ICMRoot readICMJsonFileAsObject(String fileName) {
        ICMRoot icmDataSetObject = null;
        try {
            icmDataSetObject = mapper.readValue(SourceData.asString(fileName), ICMRoot.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return icmDataSetObject;
    }


    /**
     * Convert json to java object
     * @param fileName json file for processing
     * @return PIMProductItem object for further usage
     */
    public List<PIMProductItem> readPIMJsonFileAsObjectList(String fileName) {
        List<PIMProductItem> pimDataSetObject = null;
        try {
            pimDataSetObject = mapper.readValue(SourceData.asString(fileName), new TypeReference<>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pimDataSetObject;
    }


    // TODO: Look at https://support.smartbear.com/readyapi/docs/testing/jsonpath-reference.html and implement it

    /**
     * This method is not implemented/functional and stays here as an idea
     * There is a direct way of writing JsonPath and use custom Filters
     */
    public void filterOnlyValidPIMProducts() {
        Filter notInactive = Filter.filter(Criteria.where("Status").is("Inactive"));
    }


    /**
     * Stream filter approach, too expensive as performance
     * @param fileName Provided json file
     * @return List<PIMProductItem> list of PIM product objects as PIMProductItem
     */
    public List<PIMProductItem> filterCollectionOfPIMObjects(String fileName) {
        List<PIMProductItem> allProductObjects = readPIMJsonFileAsObjectList(fileName);
        return allProductObjects.stream()
                .filter(p -> !p.getStatus().equals("Inactive") || p.getMWPSellable().equals("Yes") || p.getID().equals(""))
                .collect(Collectors.toList());
    }

}
