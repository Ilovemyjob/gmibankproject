package gmibank.stepdefinitions;

import gmibank.pages.RegisterPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import gmibank.utilities.ExcelUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegistrationStepDefinitions {
    RegisterPage inv= new RegisterPage();
    String path = ".\\src\\test\\MessageData.xlsx";
    ExcelUtil sheet1Obj = new ExcelUtil(path, "Sheet1");
    ExcelUtil sheet2Obj = new ExcelUtil(path, "Sheet2");

    @Given("user goes to  homepage")
    public void user_goes_to_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("gmiBank_url"));
    }

    @When("user clicks user icon")
    public void user_clicks_user_icon() {
        inv.userIcon.click();

    }

    @When("user clicks register button")
    public void user_clicks_register_button() {
        inv.registerButton.click();
    }

    @When("user clicks register")
    public void user_clicks_register() {
        inv.registerButton2.click();
    }

    @Then("user verifies SSN message")
    public void user_verifies_SSN_message() {
        Assert.assertTrue(inv.ssnMessage.getText().equals(sheet1Obj.getCellData(1,1)));
    }

    @Then("user verifies firstname message")
    public void user_verifies_firstname_message() {
        Assert.assertTrue(inv.firstnameMessage.getText().equals(sheet1Obj.getCellData(2,1)));
    }

    @Then("user verifies lastname message")
    public void user_verifies_lastname_message() {
        Assert.assertTrue(inv.lastnameMessage.getText().equals(sheet1Obj.getCellData(3,1)));
    }

    @Then("user verifies username message")
    public void user_verifies_username_message() {
        Assert.assertTrue(inv.usernameMessage.getText().equals(sheet1Obj.getCellData(6,1)));
    }

    @Then("user verifies email message")
    public void user_verifies_email_message() {
        Assert.assertTrue(inv.emailMessage.getText().equals(sheet1Obj.getCellData(7,1)));
    }

    @Then("user verifies new password message")
    public void user_verifies_new_password_message() {
        Assert.assertTrue(inv.passwordMessage.getText().equals(sheet1Obj.getCellData(8,1)));
    }

    @Then("user verifies confirmation password message")
    public void user_verifies_confirmation_password_message() {
        Assert.assertTrue(inv.confirmPasswordMessage.getText().equals(sheet1Obj.getCellData(9,1)));
    }
    @Then("And user verifies the visibility of message")
    public void and_user_verifies_the_visibility_of_message() {
        Driver.verifyElementDisplayed(inv.pageMessage);
    }
    @When("User enters SSN number {string}")
    public void user_enters_SSN_number(String ssnNumber) {
        Driver.waitAndSendText(inv.ssnBox, ssnNumber, 2);
    }
    @When("user enters firstname {string}")
    public void user_enters_firstname(String firstname) {
        Driver.waitAndSendText(inv.firstnameBox, firstname,2);
    }

    @When("user enters lastname {string}")
    public void user_enters_lastname(String lastname) {
        Driver.waitAndSendText(inv.lastnameBox, lastname,2);
    }

    @When("user enters address {string}")
    public void user_enters_address(String address) {
        Driver.waitAndSendText(inv.addressBox, address,2);
    }

    @When("user enters mobile phone {string}")
    public void user_enters_mobile_phone(String mobilePhone) {
        Driver.waitAndSendText(inv.mobilePhoneBox, mobilePhone,2);
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        Driver.waitAndSendText(inv.usernameBox, username,2);
    }

    @When("user enters email {string}")
    public void user_enters_email(String email) {
        Driver.waitAndSendText(inv.emailBox, email,2);
    }

    @When("user enters new password {string}")
    public void user_enters_new_password(String password) {
        Driver.waitAndSendText(inv.newPasswordBox, password,2);
    }

    @When("user enters new password confirmation {string}")
    public void user_enters_new_password_confirmation(String password) {
        Driver.waitAndSendText(inv.passwordConfirmBox, password,2);
    }
    @Then("User verifies the SSN invalid message")
    public void user_verifies_the_SSN_invalid_message() {
        Assert.assertTrue(inv.ssnInValid.getText().equals(sheet1Obj.getCellData(1,2)));
    }
    @When("User enters SSN number")
    public void user_enters_SSN_number() {

       Driver.waitAndSendText(inv.ssnBox,sheet2Obj.getCellData(1,1),2);
    }

    @When("user enters firstname")
    public void user_enters_firstname() {
        Driver.waitAndSendText(inv.firstnameBox,sheet2Obj.getCellData(2,1),2);
    }

    @When("user enters lastname")
    public void user_enters_lastname() {
        Driver.waitAndSendText(inv.lastnameBox,sheet2Obj.getCellData(3,1),2);
    }

    @When("user enters address")
    public void user_enters_address() {
        Driver.waitAndSendText(inv.addressBox,sheet2Obj.getCellData(4,1),2);
    }

    @When("user enters mobile phone")
    public void user_enters_mobile_phone() {
        Driver.waitAndSendText(inv.mobilePhoneBox,sheet2Obj.getCellData(5,1),2);
    }

    @When("user enters username")
    public void user_enters_username() {
        Driver.waitAndSendText(inv.usernameBox,sheet2Obj.getCellData(6,1),2);
    }

    @When("user enters email")
    public void user_enters_email() {
       Driver.waitAndSendText(inv.emailBox, sheet2Obj.getCellData(7,1),2);
    }

    @When("user enters new password")
    public void user_enters_new_password() {
       Driver.waitAndSendText(inv.newPasswordBox, sheet2Obj.getCellData(8,1),2);
    }

    @When("user enters new password confirmation")
    public void user_enters_new_password_confirmation() {
        Driver.waitAndSendText(inv.passwordConfirmBox,sheet2Obj.getCellData(9,1),2);
    }

    @Then("user verifies the message")
    public void user_verifies_the_message() {
        Assert.assertTrue(inv.mobilephoneInvalid.getText().equals(sheet1Obj.getCellData(5,2)));
    }
    @When("User enters SSN Number")
    public void user_enters_SSN_Number() {
        Driver.waitAndSendText(inv.ssnBox, sheet2Obj.getCellData(1,2),2);
    }

    @When("user enters Firstname")
    public void user_enters_Firstname() {
        Driver.waitAndSendText(inv.firstnameBox,sheet2Obj.getCellData(2,2),2);
    }

    @When("user enters Lastname")
    public void user_enters_Lastname() {
        Driver.waitAndSendText(inv.lastnameBox,sheet2Obj.getCellData(3,2),2);
    }

    @When("user enters Address")
    public void user_enters_Address() {
        Driver.waitAndSendText(inv.addressBox,sheet2Obj.getCellData(4,2),2);
    }

    @When("user enters Mobile phone")
    public void user_enters_Mobile_phone() {
        Driver.waitAndSendText(inv.mobilePhoneBox,sheet2Obj.getCellData(5,2),2);
    }

    @When("user enters Username")
    public void user_enters_Username() {
        Driver.waitAndSendText(inv.usernameBox,sheet2Obj.getCellData(6,2),2);
    }

    @When("user enters Email")
    public void user_enters_Email() {
        Driver.waitAndSendText(inv.emailBox,sheet2Obj.getCellData(7,2),2);
    }

    @When("user enters New password")
    public void user_enters_New_password() {
        Driver.waitAndSendText(inv.newPasswordBox, sheet2Obj.getCellData(8,2),2);
    }

    @When("user enters New password confirmation")
    public void user_enters_New_password_confirmation() {
        Driver.waitAndSendText(inv.passwordConfirmBox, sheet2Obj.getCellData(9,2),2);
    }

    @Then("user verifies the mail message")
    public void user_verifies_the_mail_message() {
        Assert.assertTrue(inv.emailInvalid.getText().equals(sheet1Obj.getCellData(7,2)));
    }


}


