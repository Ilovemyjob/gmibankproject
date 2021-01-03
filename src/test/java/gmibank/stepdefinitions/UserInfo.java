package gmibank.stepdefinitions;

import gmibank.pages.UserInfoPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class UserInfo {
    gmibank.pages.UserInfoPage userInfoPage = new gmibank.pages.UserInfoPage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("gmiBank_url"));
    }
    @Given("sign in as {string}")
    public void sign_in_as(String string) {
        Driver.login(string);
    }

    @Given("Click on user name and click on User info")
    public void click_on_user_name_and_click_on_User_info() {
        userInfoPage.accountMenu.click();
        userInfoPage.userInfo.click();
    }
    @Then("Verify that {string}, {string}, {string}, and {string} textboxes is on the page")
    public void verify_that_and_textboxes_is_on_the_page(String string, String string2, String string3, String string4) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(userInfoPage.firstNameText.getText(), string);
        softAssert.assertEquals(userInfoPage.lastNameText.getText(), string2);
        softAssert.assertEquals(userInfoPage.emailText.getText(), string3);
        softAssert.assertEquals(userInfoPage.languageText.getText(), string4);
        softAssert.assertAll("All elements populated");
    }

    @Then("Verify that {string} and {string} are in the dropbox")
    public void verify_that_and_are_in_the_dropbox(String string, String string2) {
        Select select = new Select(userInfoPage.language);
        List<WebElement> dropOptions = select.getOptions();
//        userInfoPage.language.click();
        Assert.assertEquals(dropOptions.get(0).getText(), string);
        Assert.assertEquals(dropOptions.get(1).getText(), string2);

    }



    @Given("Type {string} in first name textbox")
    public void type_in_first_name_textbox(String string) {
        userInfoPage.firstName.clear();
        userInfoPage.firstName.sendKeys(string);

    }
    @Given("Click on save button")
    public void click_on_save_button() {
       userInfoPage.saveButton.click();
    }
    @Then("Verify the success message is {string}")
    public void Verify_the_success_message_is (String string) throws InterruptedException {
        Thread.sleep(5000);
//        Driver.hover(userInfoPage.successMessage);
        Assert.assertEquals(userInfoPage.successMessage.getText(), string);
    }


    @Given("Type {string} in last name textbox")
    public void type_in_last_name_textbox(String string) {
        userInfoPage.lastName.clear();
        userInfoPage.lastName.sendKeys(string);
    }

    @Given("Type {string} in email textbox")
    public void type_in_email_textbox(String string) {
        userInfoPage.email.clear();
        userInfoPage.email.sendKeys(string);
    }
    @Then("Verify the error message is {string}")
    public void verify_the_error_message_is(String string) {
        org.junit.Assert.assertTrue(userInfoPage.errorMessage.isDisplayed());
    }

    @Then("Verify that {string} and {string} are only options in the drop box")
    public void verify_that_and_are_only_options_in_the_drop_box(String string, String string2) {
        Select select = new Select(userInfoPage.language);
        List<WebElement> dropOptions = select.getOptions();
        org.junit.Assert.assertEquals(dropOptions.get(0).getText(), string);
        org.junit.Assert.assertEquals(dropOptions.get(1).getText(), string2);
        org.junit.Assert.assertEquals(dropOptions.size(), 2);
    }
    //    password
    @Given("Click on user name and click on password")
    public void click_on_user_name_and_click_on_password() {
        userInfoPage.accountMenu.click();
        userInfoPage.password_text.click();
    }

    @Then("verify")
    public void verify() {


//        int ilk = userInfoPage.gri.size();
//        userInfoPage.newPassword.sendKeys("aliveli");
//        int son = userInfoPage.gri.size();
//        userInfoPage.newPassword.sendKeys();
//        Assert.assertTrue(ilk>2);
//        System.out.println(userInfoPage.gri.size());



    }
    @Given("Sign in to the page")
    public void sign_in_to_the_page() {
        Driver.login("manager");
    }



}
