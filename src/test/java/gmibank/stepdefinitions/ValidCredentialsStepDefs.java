package gmibank.stepdefinitions;

import gmibank.pages.SigninPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ValidCredentialsStepDefs {

    SigninPage vld = new SigninPage();


    @Given("User enters homepage")
    public void user_enters_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("gmiBank_url"));
    }

    @When("user clicks account icon")
    public void user_clicks_account_icon() {
        vld.accountMenu.click();
    }

    @When("user clicks signin")
    public void user_clicks_signin() {
        vld.singInButton.click();
    }

    @When("user clicks sign in")
    public void user_clicks_sign_in() {
       vld.signInButton2.click();
       /*
        After this step user can not see the success message after signin. In acceptance Crieteria,
        I should see and verify the success message.
        This is a bug on this step. For this situation, I added two steps to verify the successful signin
        1- Click user icon
        2- And verify if "signout" button is displayed.

        */

    }

    @Then("user verifies the signout displayed")
    public void user_verifies_the_signout_displayed() {

        Assert.assertTrue(vld.signoutButton.isDisplayed());
    }


    @When("user enters a valid user name {string}")
    public void user_enters_a_valid_user_name(String username) {
        Driver.waitAndSendText(vld.usernameBox, username,2);
    }

    @When("user enters a valid password {string}")
    public void user_enters_a_valid_password(String password) {
        Driver.waitAndSendText(vld.passwordBox, password,2);
    }


    @Then("user verifies the clickability of cancel button")
    public void user_verifies_the_clickability_of_cancel_button() {
            Driver.waitForClickablility(vld.cancelButton,2);
    }


}
