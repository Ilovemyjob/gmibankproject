package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserInfoPage {
    public UserInfoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "firstName")
    public WebElement firstName;
    @FindBy(id = "lastName")
    public WebElement lastName;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement successMessage;
    @FindBy(id = "email")
    public  WebElement email;
    @FindBy (id = "langKey")
    public WebElement language;
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement saveButton;
    @FindBy(xpath = "//h2")
    public WebElement entrance;
    @FindBy(xpath = "//label[@for='firstName']")
    public WebElement firstNameText;
    @FindBy(xpath = "//label[@for='lastName']")
    public WebElement lastNameText;
    @FindBy(xpath = "//label[@for='email']")
    public WebElement emailText;
    @FindBy(xpath = "//label[@for='langKey']")
    public WebElement languageText;
    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement errorMessage;

    //label[@for='email']
    @FindBy(id = "account-menu")
    public WebElement accountItem;
    @FindBy(id = "login-item")
    public WebElement login;
    @FindBy(name = "username")
    public WebElement username;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;
    @FindBy(id = "account-menu")
    public WebElement accountMenu;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement userInfo;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[4]")
    public WebElement password_text;
    @FindBy(id = "strengthBar")
    public WebElement str;
    @FindBy(xpath = "//li[@style='background-color: rgb(221, 221, 221);']")
    public List<WebElement> gri;
    @FindBy(id = "newPassword")
    public WebElement newPassword;

}
