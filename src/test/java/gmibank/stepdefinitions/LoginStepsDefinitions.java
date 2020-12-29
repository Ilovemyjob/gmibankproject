package gmibank.stepdefinitions;

import gmibank.pages.LoginPage;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import gmibank.utilities.ConfigReader;

public class LoginStepsDefinitions {
    WebDriver driver;
    LoginPage loginPage = new LoginPage();
   // @Given("user click to login icon")
   // public void userClickToLoginIcon() {
        //Driver.getDriver().get(ConfigReader.getProperty("gmiBank_url"));
      //  loginPage.login_icon.click();
   // }

    @And("user click link sign in")
    public void userClickLinkSignIn() {
        Driver.waitAndClick(loginPage.link_signIn,1);
    }

    @And("user enter username as  {string}")
    public void userEnterUsernameAs(String val_username) {
        Driver.waitAndSendText(loginPage.txt_username,val_username,1);

    }

    @And("user enter password as  {string}")
    public void userEnterPasswordAs(String val_password) {

        Driver.waitAndSendText(loginPage.txt_password,val_password,2);

    }

    @And("user click to sign in button")
    public void userClickToSignInButton() {

        Driver.waitAndClick(loginPage.btn_login_signIn,2);
        // loginPage.btn_login_signIn.click();

    }
}
