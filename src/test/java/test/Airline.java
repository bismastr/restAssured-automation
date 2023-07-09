package test;

import RestUtils.RestUtils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import models.CreateAirline;
import models.CreatePassenger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import services.AirlineServices;

public class Airline {
    RequestSpecification requestSpecification;
    AirlineServices airlineServices;

    @BeforeClass
    public void setUp(){
        RestUtils utils = new RestUtils();
        requestSpecification = utils.setUpRequestBuilder();
        airlineServices = new AirlineServices(requestSpecification);
    }

    @Test
    public void getAirlineAll(){
        airlineServices.getAirlineAll()
                .then().statusCode(200);


    }

    @Test
    public void getAirLineById(){
        airlineServices.getAirlineById("2")
                .then()
                .statusCode(200);
    }

    @Test
    public void createPassenger(){
        CreatePassenger body = CreatePassenger.builder()
                .airline(2)
                .trips(2)
                .name("Testing Automation")
                .build();

        Response response = airlineServices.createPassenger(body);
        System.out.println(response.prettyPrint());
    }


}
