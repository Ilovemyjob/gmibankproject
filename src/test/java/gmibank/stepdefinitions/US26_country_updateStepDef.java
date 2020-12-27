package gmibank.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.pojos.Country;
import gmibank.pojos.Customer;
import gmibank.utilities.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.Response.*;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.*;


public class US26_country_updateStepDef {

    Response response;

    List<Map<String,Object>> listOfCountries;

    Map country = new HashMap<String,Object>();


    @Given("Use api end point  {string}")
    public void useApiEndPoint(String endPoint) {

        response=given().auth()
                .oauth2(ConfigReader.getProperty("token"))
                .contentType(ContentType.JSON)
                .when()
                .get(endPoint)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract().response()
        ;
        response.prettyPrint();
    }


    @And("User finds out the size of the country list")
    public void userFindsOutTheSizeOfTheCountryList() {
        listOfCountries= response.as(ArrayList.class);
        System.out.println("nr country"+listOfCountries.size());

    }

    @And("User send a Put request endpoint {string} as {string} - {string} for upddate NewCountry")
    public void userSendAPutRequestEndpointAsForUpddateCekya(String endpoint, String newCountry, String newCountryId) {

        Map<String, Object> putBody = new HashMap<>();

        putBody.put("id", newCountryId);
        putBody.put("name", newCountry );
        putBody.put("states",null);

        Response responsePut = given().
                contentType(ContentType.JSON).
                auth().oauth2(ConfigReader.getProperty("token")).
                body(putBody).
                when().
                put(endpoint);

        //responsePut.prettyPrint();

        responsePut.
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON);

        responsePut.prettyPrint();


    }

    @Then("User verify the contry was updated as {string} - {string}")
    public void userVerifyTheContryWasUpdatedAs(String newCountry, String newCountryId) {

        String url = "https://www.gmibank.com/api/tp-countries/"+newCountryId;
        Response responseAfterPut = given().
                contentType(ContentType.JSON).
                auth().oauth2(ConfigReader.getProperty("token")).
                when().
                get(url);
        responseAfterPut.
                then().
                statusCode(200).
                contentType(ContentType.JSON);
        JsonPath jsonPath = responseAfterPut.jsonPath();
        if(newCountry==responseAfterPut.jsonPath().getString("name")){
            System.out.println(responseAfterPut.jsonPath().getString("name"));
        }

        String county = jsonPath.getString("name");
        Assert.assertEquals(county, newCountry);

    }




}
