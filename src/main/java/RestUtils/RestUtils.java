package RestUtils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class RestUtils {
    RequestSpecification requestSpecification;

    public RequestSpecification setUpRequestBuilder(){
        return requestSpecification =  new RequestSpecBuilder()
                .setBaseUri("https://api.instantwebtools.net")
                .addHeader("Authorization", "Bearer "+ getToken())
                .build();
    }

    private String getToken() {
        String clientId = "0oahdhjkutaGcIK2M4x6";
        String username = "api-user4@iwt.net";
        String password = "b3z0nV0cLO";

        Response response = given()
                .urlEncodingEnabled(true)
                .formParam("grant_type", "password")
                .formParam("client_id", clientId)
                .formParam("username", username)
                .formParam("password", password)
                .formParam("scope", "offline_access")
                .when()
                .post("https://dev-457931.okta.com/oauth2/aushd4c95QtFHsfWt4x6/v1/token");

        return response.jsonPath().getString("access_token");
    }
}
