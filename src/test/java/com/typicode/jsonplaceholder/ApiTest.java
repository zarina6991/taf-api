package com.typicode.jsonplaceholder;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ApiTest {
    @Test
    public void testGet() {
        ApiService apiService = new ApiService();
        apiService.doGetRequest();
        apiService.getStatusCode();
        Assertions.assertEquals(200, apiService.getStatusCode());
    }

    @Test
    public void testGet2() {
        Response response = given().when().get("https://jsonplaceholder.typicode.com/posts/1");
        response.then().log().all().statusCode(200);
    }

    @Test
    public void testPost() {
        String BODY = """
                {
                    "userId": 1,
                    "id": 2,
                    "title": "qui est esse",
                    "body": "est rerum tempore vitae\\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\\nqui aperiam non debitis possimus qui neque nisi nulla"
                }
                """;
        Response response = given().body(BODY).when().post("https://jsonplaceholder.typicode.com/posts");
        response.then().log().all().statusCode(200);
    }

    @Test
    public void testDelete() {
        String BODY = """
                {
                    "userId": 1,
                    "id": 2,
                    "title": "qui est esse",
                    "body": "est rerum tempore vitae\\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\\nqui aperiam non debitis possimus qui neque nisi nulla"
                }
                """;
        Response response = given().body(BODY).when().delete("https://jsonplaceholder.typicode.com/posts/1");
        response.then().log().all().statusCode(200);
    }
}
