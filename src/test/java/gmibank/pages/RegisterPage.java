package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "account-menu")
    public WebElement userIcon;

    @FindBy(linkText = "Register")
    public WebElement registerButton;

    @FindBy(id="ssn")
    public WebElement ssnBox;

    @FindBy(id = "firstname")
    public WebElement firstnameBox;

    @FindBy(id="lastname")
    public WebElement lastnameBox;

    @FindBy(id="address")
    public WebElement addressBox;

    @FindBy(id="mobilephone")
    public WebElement mobilePhoneBox;

    @FindBy(id="username")
    public WebElement usernameBox;

    @FindBy(id="email")
    public WebElement emailBox;

    @FindBy(id="firstPassword")
    public WebElement newPasswordBox;

    @FindBy(id="secondPassword")
    public WebElement passwordConfirmBox;

    @FindBy(id="register-submit")
    public WebElement registerButton2;

    @FindBy(xpath="/html/body/div/div/div/div[3]/div[1]/div/div/div[2]/div/div")
    public WebElement pageMessage;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div/div/div[2]/div/form/div[1]/div")
    public  WebElement ssnMessage;

    @FindBy(xpath="/html/body/div/div/div/div[3]/div[1]/div/div/div[2]/div/form/div[2]/div")
    public WebElement firstnameMessage;

    @FindBy(xpath="/html/body/div/div/div/div[3]/div[1]/div/div/div[2]/div/form/div[3]/div")
    public WebElement lastnameMessage;

    @FindBy(xpath="/html/body/div/div/div/div[3]/div[1]/div/div/div[2]/div/form/div[6]/div")
    public WebElement usernameMessage;

    @FindBy(xpath="/html/body/div/div/div/div[3]/div[1]/div/div/div[2]/div/form/div[7]/div")
    public WebElement emailMessage;

    @FindBy(xpath="/html/body/div/div/div/div[3]/div[1]/div/div/div[2]/div/form/div[8]/div")
    public WebElement passwordMessage;

    @FindBy(xpath="/html/body/div/div/div/div[3]/div[1]/div/div/div[2]/div/form/div[10]/div")
    public WebElement confirmPasswordMessage;

    @FindBy(xpath="/html/body/div/div/div/div[3]/div[1]/div/div/div[2]/div/form/div[1]/div")
    public WebElement ssnInValid;

    @FindBy (xpath="/html/body/div/div/div/div[3]/div[1]/div/div/div[2]/div/form/div[5]/div")
    public WebElement mobilephoneInvalid;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div/div/div[2]/div/form/div[7]/div")
    public WebElement emailInvalid;

    //halloooooo







}
