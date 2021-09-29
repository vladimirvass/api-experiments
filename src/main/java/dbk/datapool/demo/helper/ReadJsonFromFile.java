package dbk.datapool.demo.helper;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import dbk.datapool.demo.helper.databinding.models.testdata.Products;
import dbk.datapool.demo.helper.databinding.models.testdata.TestDataSetJSON;
import net.minidev.json.JSONArray;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

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
     * Covert json to java object
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


    public BigDecimal getProductPriceFromObject(String fileName, String productSku) {
        Products bla = readJsonFileAsObject(fileName)
                .getProducts();

        bla
                .getTESTPRODUCT001()
                .getVariants().get(0)
                .getSellingPrice();
        return null;
    }

    public String getProductPriceFromObjectBla(String fileName, String productSku) {
        List<Products> products = (List<Products>) readJsonFileAsObject(fileName)
                .getProducts().getTESTPRODUCT001();

        Optional<Products> matchingProduct = products.stream().
                filter(p -> p.getTESTPRODUCT001().getVariants().get(0).getSku().equals(productSku))
                .findFirst();
         return matchingProduct.toString();
    }
}
