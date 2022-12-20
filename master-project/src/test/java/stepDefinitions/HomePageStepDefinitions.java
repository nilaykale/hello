package stepDefinitions;

import io.cucumber.java.en.Then;
import pageObjects.HomePage;

public class HomePageStepDefinitions extends BaseStepDefinitions{
    private final HomePage homePage = new HomePage(driver);

    @Then("^User should see the home page$")
    public void HomePageURL(){
        homePage.HomePageURL();
    }

    @Then("^Check the Pop-up$")
    public void CheckPopUp(){
        homePage.CheckPopUp();
    }
    @Then("^Click on \"Request\" button$")
    public void Request(){
        homePage.Request();
    }

    @Then("^Click on \"Create New Request\" button$")
    public void NewRequest(){
        homePage.NewRequest();
    }

    @Then("^User choose (.*)$")
    public void choose_receiver(String receiver){
        homePage.choose_receiver(receiver);
    }

    @Then("^Click on \"My Profile\" button$")
    public void MyProfile(){
        homePage.MyProfile();
    }

    @Then("^Click on \"Dashboard\" button$")
    public void Dashboard(){
        homePage.Dashboard();
    }
    @Then("^Click on \"Gender\" button$")
    public void Gender() {
        homePage.Gender();
    }

    @Then("^Click on \"Save Changes\" button$")
    public void SaveChanges() {
        homePage.SaveChanges();
    }

    @Then("^Select the \"Male\" option$")
    public void Male(){
        homePage.Male();
    }

    @Then("^User changes (.*) and (.*) and (.*)$")
    public void enter_Day_Mount_Year(String day, String month, String year){
        homePage.enter_Day_Mount_Year(day, month, year);
    }

    @Then("^User add (.*)$")
    public void change_BirthPlace(String birthPlace){
        homePage.change_BirthPlace(birthPlace);
    }

    @Then("^User new (.*) and (.*)$")
    public void subject(String subject, String request){
        homePage.subject(subject, request);
    }

    @Then("^Click on \"Log Out\"$")
    public void logOut(){
        homePage.logOut();
    }

    @Then("^User should see the login page$")
    public void LoginPageUrl(){
        homePage.LoginPageURL();
    }
}

