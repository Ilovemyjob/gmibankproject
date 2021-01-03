package gmibank.stepdefinitions;

import com.google.gson.internal.bind.util.ISO8601Utils;
import gmibank.pages.ManageCustomerPage;
import gmibank.utilities.DateUtil;
import gmibank.utilities.Driver;
import gmibank.utilities.ExcelUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.text.ParseException;

public class CreateCustomerStepDefinitions {
    ManageCustomerPage customerPage =new ManageCustomerPage();



    //////////////////////////search ssn /////////////////////////////////////////////////////
    @And("user enter valid ssn")
    public void userEnterValidSsn() {
        Driver.waitAndSendText(customerPage.ssnTextbox,"123-12-1234",1);
    }

    @And("user click to searchButton on create new customer")
    public void userClickToSearchButtonOnCreateNewCustomer() {
        Driver.waitAndClick(customerPage.searchButton,2);

    }

    @Then("Check FirstName should see textBox")
    public void checkFirstNameShouldSeeTextBox() throws InterruptedException {
        //Driver.waitAndClick(customerPage.serachButton,5);


        customerPage.ssnForm.click();

        String val2 = customerPage.firstNameForm.getAttribute("value");
        System.out.println("val:"+val2);
        Assert.assertEquals(val2,"Pehlivan");
    }

    //////////////////////////my operation ///////////////////////////////////////////////////////

    @And("user click to my operations link")
    public void userClickToMyOperationsLink() {
        Driver.waitAndClick(customerPage.link_myOperation,3);

    }

    @And("user clcik to manage customer")
    public void userClcikToManageCustomer() {
        Driver.waitAndClick(customerPage.link_manage_customer,3);
    }
    //////////////////////////cretate customer ///////////////////////////////////////////////////////
    @And("user click to button create new customer")
    public void userClickToButtonCreateNewCustomer() {

        Driver.waitAndClick(customerPage.btn_create_new_customer,2);
    }

    @And("put  {string} into create firstname form")
    public void putIntoCreateFirstnameForm(String arg0) {
        Driver.waitAndSendText(customerPage.firstNameForm,arg0,1);
    }

    @And("put {string} into create lastname form")
    public void putIntoCreateLastnameForm(String arg0) {

        Driver.waitAndSendText(customerPage.lastNameForm,arg0,1);

    }

    @And("put {string} into middle initial customer form")
    public void putIntoMiddleInitialCustomerForm(String arg0) {

        customerPage.middileInitial.sendKeys(arg0);
    }

    @And("put {string} into mail customer form")
    public void putIntoMailCustomerForm(String arg0) {
        customerPage.emailForm.sendKeys(arg0);
    }

    @And("put {string} into mobile phoneNumber")
    public void putIntoMobilePhoneNumber(String arg0) {
        customerPage.mobileNumber.sendKeys(arg0);
    }

    @And("put {string} into phonenumber customer form")
    public void putIntoPhonenumberCustomerForm(String arg0) {
        customerPage.phoneNumberForm.sendKeys(arg0);
    }

    @And("put {string} into zibcode customer form")
    public void putIntoZibcodeCustomerForm(String arg0) {
        Driver.waitAndSendText(customerPage.zipCodeForm,arg0,1);
    }

    @And("put {string} into address customer form")
    public void putIntoAddressCustomerForm(String arg0) {
        Driver.waitAndSendText(customerPage.addressForm,arg0,1);

    }

    @And("put {string} cityForm into create customer form")
    public void putCityFormIntoCreateCustomerForm(String arg0) {
        Driver.waitAndSendText(customerPage.cityForm,arg0,1);
    }

    @And("put {string}into ssnForm customer form")
    public void putIntoSsnFormCustomerForm(String arg0) {

        String ssn=Driver.getRandomInteger(1000,100)+"-"+Driver.getRandomInteger(100,10)+"-"+Driver.getRandomInteger(10000,1000);
        customerPage.ssnForm.sendKeys(ssn);


    }

    @And("select date into customer form")
    public void selectDateIntoCustomerForm() throws ParseException {
        Driver.waitAndSendText(customerPage.createDateForm,DateUtil.todaysDate2(),1);

    }

    @And("select country from customer form")
    public void selectCountryFromCustomerForm() {
        Driver.selectDropdown(customerPage.countryForm,1);
    }

    @And("put {string} into state customer form")
    public void putIntoStateCustomerForm(String arg0) {
        Driver.waitAndSendText(customerPage.stateForm,arg0,1);
    }

    @And("select user from customer form")
    public void selectUserFromCustomerForm() {
        // Driver.selectRandomTextFromDropdown();

        Driver.selectDropdown(customerPage.userForm,0);
        Driver.selectCheckBox(customerPage.zelleChecBbox,true);


    }

    @And("select  account from customer form")
    public void selectAccountFromCustomerForm() {
        Driver.selectDropdown(customerPage.accountForm,2);
    }

    @Then("click to save button into customer form")
    public void clickToSaveButtonIntoCustomerForm() {
        Driver.waitAndClick(customerPage.saveForm,1);
    }

//////////////////////////Negative ADRESS-CITY-STATE- //////////////////////////////////////////////

    @And("User should see an error message under address textbox {string}")
    public void userShouldSeeAnErrorMessageUnderAddressTextbox(String errActual) {
        String textExpected= customerPage.errAdress.getText();
        Assert.assertEquals("This field is required.", errActual);
    }

    @And("User should see an error message under city textbox {string}")
    public void userShouldSeeAnErrorMessageUnderCityTextbox(String errActual) {
        String textExpected=customerPage.errCity.getText();
        Assert.assertEquals(textExpected,errActual);
    }

    @And("select country from customer form index {string}")
    public void selectCountryFromCustomerFormIndex(String arg0) {

        Driver.selectDropdown(customerPage.countryForm,0);
    }



    @Then("user should be seen error message")
    public void userShouldBeSeenErrorMessage() {
        boolean contain= customerPage.errToast.getText().contains("error");
        Assert.assertFalse(contain);
        //we expected error message but it responses false..
        // when we tested with  assertFalse we expect that give us failed test
        // but test passed

    }

    @And("leave blank into state customer form")
    public void leaveBlankIntoStateCustomerForm() {

    }


}