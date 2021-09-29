package docker;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static java.util.stream.Collectors.joining;

public class Demo {

    RequestSpecification spec;


    public String provideQueryParamListWithStream() {
        List<String> outOfStockProducts = List.of("663665", "222222", "333333", "444444");

        return outOfStockProducts.stream()
                .map(item -> "sku=" + item)
                .collect(joining("&"));
    }

    @BeforeMethod
    public void initSpec() {
        spec = new RequestSpecBuilder()
                .setBaseUri("http://blabla.com")
                .setBasePath("/products/inventory")
                .addQueryParam(provideQueryParamListWithStream())
                .build();
    }

    @Test
    public void getAllProductsFromList() {
        given().spec(spec)
                .when().log().all()
                .get()
                .then().log().all()
                .statusCode(200);
    }
}