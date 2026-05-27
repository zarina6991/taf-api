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

    public void doPutRequest() {
        response = given().when().put("https://jsonplaceholder.typicode.com/posts/1");
    }

    public void doPatchRequest() {
        response = given().when().patch("https://jsonplaceholder.typicode.com/posts/1");
    }
}
