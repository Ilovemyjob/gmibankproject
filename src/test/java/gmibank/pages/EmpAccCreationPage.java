package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EmpAccCreationPage {

    public EmpAccCreationPage(){
        PageFactory.initElements(Driver.getDriver(), this );
    }

//    @FindBy(id = "account-menu")
//    public WebElement loginIcon;

    @FindBy(id = "login-item")
    public WebElement signInButton;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(linkText = "My Operations")
    public WebElement myOperations;

    @FindBy(linkText = "Manage Accounts")
    public WebElement manageAccounts;

    @FindBy(linkText = "Create a new Account")
    public WebElement createNewAccount;

    @FindBy(id = "tp-account-description")
    public WebElement descriptionBox;

    @FindBy(xpath = "(//div[text()='This field is required.'])[1]")
    public WebElement descriptionBoxWarning;

    @FindBy(id = "balanceLabel")
    public WebElement clickAnywhere;

    @FindBy(id = "tp-account-balance")
    public WebElement balanceBox;

    @FindBy(xpath ="(//div[text()='This field is required.'])")
    public WebElement balanceBoxWarning;

    @FindBy(xpath = "(//div[text()='This field should be a number.'])")
    public WebElement balanceBoxNumberWarning;

    @FindBy(id = "tp-account-accountType")
    public WebElement accountTypeBox;

    @FindBy(id = "tp-account-accountType")
    public List<WebElement> accountTypeBoxL;

    @FindBy(id = "tp-account-accountStatusType")
    public WebElement accountStatusBox;

    @FindBy(id = "tp-account-employee")
    public WebElement employeeBox;
}
