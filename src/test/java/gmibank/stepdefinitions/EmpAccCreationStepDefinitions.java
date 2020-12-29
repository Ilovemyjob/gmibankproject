package gmibank.stepdefinitions;

import gmibank.pages.EmpAccCreationPage;
import gmibank.pages.LoginPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertFalse;

public class EmpAccCreationStepDefinitions {

    EmpAccCreationPage empAccCreationPage = new EmpAccCreationPage();
    LoginPage loginPage = new LoginPage();

    @Given("employee goes to GMI Bank homepage")
    public void employee_goes_to_GMI_Bank_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("gmiBank_url"));
    }

    @Given("user click to login icon")
    public void user_clik_to_login_icon() {
        loginPage.login_icon.click();
    }

    @Given("user click to Sign in")
    public void user_clik_to_Sign_in() {
        loginPage.link_signIn.click();
    }

    @Given("user click to Username box and send {string}")
    public void user_clik_to_Username_box_and_send(String username) {
        Driver.waitAndSendText(loginPage.txt_username, username, 5);
    }

    @Given("user click to Password box and send {string}")
    public void user_click_to_Password_box_and_send(String password) {
        Driver.waitAndSendText(loginPage.txt_password, password, 5);
    }

    @Given("user click to Sign in button")
    public void user_click_to_Sign_in_button() {
        empAccCreationPage.submit.click();
    }

    @Given("user click to My Operations button")
    public void user_click_to_My_Operations_button() {
        empAccCreationPage.myOperations.click();
    }

    @Given("user click to Manage Accounts button")
    public void user_click_to_Manage_Accounts_button() {
        empAccCreationPage.manageAccounts.click();
    }

    @Given("user click to Create New Account button")
    public void user_click_to_Create_New_Account_button() {
        empAccCreationPage.createNewAccount.click();
    }

    @Given("user leaves the description box blank")
    public void user_leaves_the_description_box_blank() {
        empAccCreationPage.descriptionBox.click();
        empAccCreationPage.clickAnywhere.click();
        System.out.println(empAccCreationPage.descriptionBoxWarning.getText());
    }

    @Then("verify the message is {string}")
    public void verify_the_message_is(String message) {
        Assert.assertEquals(empAccCreationPage.descriptionBoxWarning.getText(), message);
    }

    @Given("user click again to Description box and send {string}")
    public void user_click_again_to_Description_box_and_send(String desc) {
        empAccCreationPage.descriptionBox.sendKeys(desc);
    }

    @Then("verify the warning message is not displayed")
    public void verify_the_warning_message_is_not_displayed() throws InterruptedException {
        try {
            Assert.assertFalse(empAccCreationPage.descriptionBoxWarning.isDisplayed());
        } catch (Exception e) {
        }
    }

    @Given("user leaves the Balance box blank")
    public void user_user_leaves_the_Balance_box_blank() throws InterruptedException {
        empAccCreationPage.balanceBox.click();
        empAccCreationPage.clickAnywhere.click();
        Assert.assertEquals(empAccCreationPage.balanceBoxWarning.getText(), ConfigReader.getProperty("description_warning"));
    }

    @Given("user provides string Balance {string}")
    public void user_provides_string_Balance(String balance) {
        Driver.waitAndSendText(empAccCreationPage.balanceBox, balance, 5);
        empAccCreationPage.clickAnywhere.click();
    }

    @Then("verify the balance message is {string}")
    public void verify_the_balance_message_is(String message) {
        Assert.assertEquals(empAccCreationPage.balanceBoxNumberWarning.getText(), ConfigReader.getProperty("balance_warning"));
        empAccCreationPage.balanceBox.clear();
    }

    @Given("user provides symbol Balance {string}")
    public void user_provides_symbol_Balance(String balance) {
        Driver.waitAndSendText(empAccCreationPage.balanceBox, balance, 5);
        empAccCreationPage.clickAnywhere.click();
        Assert.assertEquals(empAccCreationPage.balanceBoxNumberWarning.getText(), ConfigReader.getProperty("balance_warning"));
    }

    @Given("user provides positive Balance {string}")
    public void user_provides_positive_Balance(String balance) throws InterruptedException {
        Driver.waitAndSendText(empAccCreationPage.balanceBox, balance, 5);
        empAccCreationPage.clickAnywhere.click();
    }

    @Then("verify the balance warning message is not displayed")
    public void verify_the_balance_warning_message_is_not_displayed() {
        try {
            Assert.assertFalse(empAccCreationPage.balanceBoxWarning.isDisplayed());
        } catch (Exception e) {
        }
    }

    @Given("user provides negative Balance {string}")
    public void user_provides_negative_Balance(String negbalance) {
        empAccCreationPage.balanceBox.clear();
        Driver.waitAndSendText(empAccCreationPage.balanceBox, negbalance, 5);
    }

    @Then("verify the wrong balance warning is {string}")
    public void verify_the_wrong_balance_warning_is(String string) {
        Assert.assertEquals(empAccCreationPage.balanceBoxNumberWarning.getText(), ConfigReader.getProperty("balance_negative_warning"));
    }

    @Given("user selects Account Type and verifies the options")
    public void user_selects_Account_Type_and_verifies_the_options() {

        List<String> accTypes = new ArrayList<>();
        accTypes.add("CHECKING");
        accTypes.add("SAVING");
        accTypes.add("CREDIT_CARD");
        accTypes.add("INVESTING");

        Select drpDown = new Select(empAccCreationPage.accountTypeBox);
        List<WebElement> accList = drpDown.getOptions();
        for (WebElement acc : accList) {
            Assert.assertTrue(accTypes.contains(acc.getText()));
        }
    }

    @Given("user does not select any option and checks the warning")
    public void user_does_not_select_any_option_and_checks_the_warning() {
        Driver.selectDropdown(empAccCreationPage.accountTypeBox, 0);
        Assert.assertEquals(empAccCreationPage.accountTypeBox.getAttribute("value"), "Please select account type");
    }
    @Given("user does not select any option and gets warning")
    public void user_does_not_select_any_option_and_gets_warning(){
        Driver.selectDropdown(empAccCreationPage.accountTypeBox, 0);
        Assert.assertEquals(empAccCreationPage.accountTypeBox.getAttribute("value"), "Please select account type");
    }

    @Given("user selects Account Status Type and verifies the options")
    public void user_selects_Account_Status_Type_and_verifies_the_options() {
        Driver.selectDropdown(empAccCreationPage.accountStatusBox, 0);
        Assert.assertEquals(empAccCreationPage.accountStatusBox.getAttribute("value"), "ACTIVE");

        Driver.selectDropdown(empAccCreationPage.accountStatusBox, 1);
        Assert.assertEquals(empAccCreationPage.accountStatusBox.getAttribute("value"),"SUSPENDED");

        Driver.selectDropdown(empAccCreationPage.accountStatusBox, 2);
        Assert.assertEquals(empAccCreationPage.accountStatusBox.getAttribute("value"),"CLOSED");
    }

    @Given("user click to Employee box and select employee as {string}")
    public void user_click_to_Employee_box_and_select_employee_as(String string) {
        Driver.selectDropdown(empAccCreationPage.employeeBox,0);
        Assert.assertEquals(empAccCreationPage.employeeBox.getAttribute("value"), "emrullahd");
    }

    }