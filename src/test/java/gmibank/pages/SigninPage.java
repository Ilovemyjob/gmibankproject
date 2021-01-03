package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

    public SigninPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(linkText = "Sign in")
    public WebElement singInButton;

    @FindBy(id="username")
    public WebElement usernameBox;

    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement signInButton2;

    @FindBy(linkText = "Sign out")
    public WebElement signoutButton;

    @FindBy(xpath="/html/body/div[2]/div/div[1]/div/div/form/div[3]/button[1]/span")
    public WebElement cancelButton;







}
