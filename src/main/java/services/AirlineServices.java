package services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import models.CreatePassenger;

public class AirlineServices {
    private final RequestSpecification requestSpecification;

    public AirlineServices(RequestSpecification requestSpecification) {
        this.requestSpecification = requestSpecification;
    }

    public Response getAirlineById(String id){
        return RestAssured.given()
                .spec(requestSpecification)
                .basePath("v2/airlines/"+id)
                .when()
                .get();
    }

    public Response getAirlineAll(){
        return RestAssured.given()
                .spec(requestSpecification)
                .basePath("/v2/airlines")
                .when()
                .get();
    }

    public Response createPassenger(CreatePassenger body){
        return RestAssured.given()
                .spec(requestSpecification)
                .basePath("/v2/passenger")
                .contentType(ContentType.JSON)
                .when()
                .body(body)
                .post();
    }

}
