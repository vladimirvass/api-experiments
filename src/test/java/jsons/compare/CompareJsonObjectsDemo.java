package jsons.compare;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import dbk.datapool.demo.helper.ReadJsonFromFile;
import org.testng.annotations.Test;

public class CompareJsonObjectsDemo {

    String JsonObject1;
    String jsonObject2;
    ObjectMapper objectMapper;
    JsonNode jsonNode1;
    JsonNode jsonNode2;


    @Test
    public void compareTwoJsonObjects() throws JsonMappingException, JsonProcessingException {
        JsonObject1 = "{\r\n" +
                "  \"firstName\" : \"Baba\",\r\n" +
                "  \"lastName\" : \"Meca\"\r\n" +
                "}";

        jsonObject2 = "{\r\n" +
                "  \"firstName\" : \"Baba\",\r\n" +
                "  \"lastName\" : \"Meca\"\r\n" +
                "}";

        objectMapper = new ObjectMapper();
        jsonNode1 = objectMapper.readTree(JsonObject1);
        jsonNode2 = objectMapper.readTree(jsonObject2);

        // Checking if both json objects are same
        System.out.println(jsonNode1.equals(jsonNode2));
    }

    @Test
    public void compareTwoJsonObjectsWithDifferentOrderOfRootElements() throws JsonProcessingException {
        // Change in order of elements does not impact
        JsonObject1 = "{\r\n" +
                "  \"firstName\" : \"Baba\",\r\n" +
                "  \"lastName\" : \"Meca\"\r\n" +
                "}";

        jsonObject2 = "{\r\n" +
                "  \"lastName\" : \"Zaio\",\r\n" +
                "  \"firstName\" : \"Baio\"\r\n" +
                "  \r\n" +
                "}";

        jsonNode1 = objectMapper.readTree(JsonObject1);
        jsonNode2 = objectMapper.readTree(jsonObject2);

        System.out.println(jsonNode1.equals(jsonNode2));
    }

    @Test
    public void compareTwoNestedJsonObjects() throws JsonProcessingException {

        // Nested json objects can also be compared with equals method
        JsonObject1 = "{\r\n" +
                "  \"lastName\": \"Mahajan\",\r\n" +
                "  \"firstName\": \"Amod\",\r\n" +
                "  \"address\": {\r\n" +
                "    \"city\": \"Katihar\",\r\n" +
                "    \"state\": \"Bihar\"\r\n" +
                "  }\r\n" +
                "}";
        jsonObject2 = "{\r\n" +
                "  \"lastName\": \"Mahajan\",\r\n" +
                "  \"firstName\": \"Amod\",\r\n" +
                "  \"address\": {\r\n" +
                "    \"city\": \"Katihar\",\r\n" +
                "    \"state\": \"Bihar\"\r\n" +
                "  }\r\n" +
                "}";

        jsonNode1 = objectMapper.readTree(JsonObject1);
        jsonNode2 = objectMapper.readTree(jsonObject2);

        System.out.println(jsonNode1.equals(jsonNode2));
    }

    @Test
    public void compareTwoJsonFiles() {
        ReadJsonFromFile firstJson = new ReadJsonFromFile();
        ReadJsonFromFile secondJson = new ReadJsonFromFile();
        String bauJson = String.valueOf(firstJson.readJsonFileAsString("uat.json"));
        String prodJson = String.valueOf(secondJson.readJsonFileAsString("prod.json"));
        System.out.println(bauJson.equals(prodJson));
    }

}
