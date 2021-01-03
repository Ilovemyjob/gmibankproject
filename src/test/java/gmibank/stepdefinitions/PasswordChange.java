package gmibank.stepdefinitions;

import gmibank.pages.PasswordPage;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class PasswordChange {
    PasswordPage passwordPage = new PasswordPage();
    @Given("User goes to the home page")
    public void user_goes_to_the_home_page() {
        Driver.getDriver().get("gmiBank_url");
    }
    @Given("Click on the username icon and click on sign in")
    public void click_on_the_username_icon_and_click_on_sign_in() {
        passwordPage.accountItem.click();
        passwordPage.signIn.click();
    }
    @Given("User enter the username and password")
    public void user_enter_the_username_and_password() {
        passwordPage.username.sendKeys("User");
        passwordPage.password.sendKeys("Password");
    }
    @Given("Click on sign in button")
    public void click_on_sign_in_button() {
        passwordPage.signInButton.click();
    }
    @Given("Click on user icon and click on Password")
    public void click_on_user_icon_and_click_on_Password() {
        passwordPage.accountMenu.click();
        passwordPage.passwordButton.click();
    }
    @Given("Enter {string} to the current password textbox.")
    public void enter_to_the_current_password_textbox(String string) {
        passwordPage.currentPassword.sendKeys(string);
    }
    @Given("Enter {string} to the New password textbox.")
    public void enter_to_the_New_password_textbox(String string) {
        passwordPage.newPassword.sendKeys(string);
    }
    @Given("Enter {string} to the New confirmation password textbox.")
    public void enter_to_the_New_confirmation_password_textbox(String string) {
        passwordPage.confirmPassword.sendKeys(string);
    }
    @Given("Click on the save button.")
    public void click_on_the_save_button() {
        passwordPage.saveButton.click();
    }
    @Then("There should be a Error Message")
    public void there_should_be_a_Error_Message() {
        Assert.assertTrue(passwordPage.errorMessage.getText().contains("Password could not be changed"));
    }
    @Given("User send {string} into the New Password textbox.")
    public void user_send_into_the_New_Password_textbox(String string) {
        passwordPage.newPassword.sendKeys(string);
    }
    @Then("Verify the password strength is increased.")
    public void verify_the_password_strength_is_increased() {
        int i = passwordPage.strength.size();
        Assert.assertTrue(i<4);
        System.out.println(passwordPage.strength.size());
    }
}
