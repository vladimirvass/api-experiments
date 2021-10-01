package dbk.datapool.demo.testsuite;

import dbk.datapool.demo.data.ProductData;
import dbk.datapool.demo.data.ProductDataProvider;
import dbk.datapool.demo.helper.ReadJsonFromFile;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.math.BigDecimal;


/**
 * Class to test different prices depending of logged in users and their user groups association
 * @author vlad vasilev
 */
public class ProductDemoTest extends ProductTestBase {

    @Override
    @BeforeMethod
    public void setUp() {
    }


    @Parameters({"productSKU"})
    @Test(testName = "Verify different prices depending of different user groups"
            , description = "Verify 3 different prices when logged in with 3 different users"
            , dataProvider = "allProductSKUOptions"
            , dataProviderClass = ProductDataProvider.class)
    public void verifyDifferentPricesAccordingDifferentUsers(ProductData sku) {
        BigDecimal apiPrice, jsonPrice, uiPrice;

        // First approach
        ReadJsonFromFile jsonAsString = new ReadJsonFromFile();
        jsonPrice = jsonAsString.getProductPriceFromJSON("prod.json", sku.productSKU);
//        System.out.println(jsonPrice);

        // Second approach
        ReadJsonFromFile jsonAsObject = new ReadJsonFromFile();
//        System.out.println(jsonAsString.getProductPriceFromObjectBla("prod.json", sku.productSKU));

    }

}
