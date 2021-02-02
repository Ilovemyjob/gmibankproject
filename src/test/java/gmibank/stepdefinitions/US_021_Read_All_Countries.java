package gmibank.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.pojos.Country;
import gmibank.pojos.Customer;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.ReadTxt;
import gmibank.utilities.WriteToTxt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.given;

public class US_021_Read_All_Countries {
    Response response;
    Customer[] customers;
    List<String> expected;
    Country[]country;
    List<String> expectedC;

    @Given("user go to api end point {string}")
    public void user_go_to_api_end_point(String string) {
        response=given().auth().oauth2(ConfigReader.getProperty("token")).contentType(ContentType.JSON).when()
                .get("https://www.gmibank.com/api/tp-countries").then().contentType(ContentType.JSON).extract().response();

    }

    @Given("read all countries and write")
    public void read_all_countries_and_write() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        country = objectMapper.readValue(response.asString(), Country[].class);
        for(int i=0;i<country.length;i++){
            System.out.println(country[i].getId()+" | " + country[i].getName());
         }
        WriteToTxt.saveAllCountry("src\\test\\java\\gmibank\\test-data\\countryId.txt", country);
    }
    @Then("validate countries")
    public void validate_countries() {
        List<String> expCount = new ArrayList<>();
        for (int i=0;i<country.length;i++){
            expCount.add(String.valueOf(country[i].getId()));
        }
        List<String> allCount = ReadTxt.returnCountryId("src\\test\\java\\gmibank\\test-data\\countryId.txt");
        Assert.assertEquals(expCount, allCount);

    }

}


