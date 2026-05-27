package com.typicode.jsonplaceholder;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class ApiService {
    private Response response;

    public void doGetRequest() {
        response = given().when().get("https://jsonplaceholder.typicode.com/posts");
    }

    public int getStatusCode() {
        return response.getStatusCode();
    }
}
