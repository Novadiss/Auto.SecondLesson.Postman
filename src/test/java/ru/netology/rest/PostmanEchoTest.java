package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matcher.equalTO;

class PostmanEchoTest {

    @Test
    void shouldReturnSendData () {
                given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTO("some data"))
        ;
    }

}
