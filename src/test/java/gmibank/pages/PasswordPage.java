package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PasswordPage {
    public PasswordPage(){
        PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(id = "account-menu")
    public WebElement accountItem;
    @FindBy(id = "login-item")
    public WebElement signIn;
    @FindBy(name = "username")
    public WebElement username;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;
    @FindBy(id = "account-menu")
    public WebElement accountMenu;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[4]")
    public WebElement passwordButton;
    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement currentPassword;
    @FindBy(xpath ="//input[@name='newPassword']")
    public WebElement newPassword;
    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement confirmPassword;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;
    @FindBy(xpath = "//li[@style='background-color: rgb(221, 221, 221);']")
    public List<WebElement> strength;
    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement errorMessage;
}
