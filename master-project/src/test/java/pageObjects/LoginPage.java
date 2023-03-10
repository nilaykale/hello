package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "username")
    private WebElement emailField;

    @FindBy(id = "password")
    private  WebElement passwordField;

    @FindBy(id = "onetrust-accept-btn-handler")
    private  WebElement acceptedButon;

    @FindBy(xpath = "//*[@class=\"btn text-uppercase font-weight-bold mb-2 loginButton text-right\"]")
    private  WebElement loginButton;

    @FindBy(xpath = "//*[@class=\"toast-message\"]")
    private  WebElement ErrorMessageItem;

    @FindBy(id = "toast-container")
    private WebElement PopUpExist;

    @FindBy(id="EmailLogin-error")
    private WebElement EmailErrorMessage;

    @FindBy(xpath = "//*[@class=\"form-group__placeholder js-validation-label\"]")
    private WebElement PasswordTrue;

    @FindBy(id="Password-error")
    private WebElement PasswordErrorMessage;

    @FindBy(xpath = "//*[@class=\"main-eng js-load-complete\"]")
    private WebElement MyAccount;

    public void enter_Username_Password(String email, String password){
        sendKeys(emailField, email);
        sendKeys(passwordField, password);
    }
    public void accepted(){
        click(acceptedButon);
    }
    public void login(){
        click(loginButton);
    }
    public void CloseErrorMessage(){
        Assert.assertTrue("Please fill both fields!",isExist(PopUpExist));
        click(ErrorMessageItem);
    }
   public void CheckEmailErrorMessage(){
       Assert.assertTrue("Uyarı mesajı geldi",isExist(EmailErrorMessage));
    }

    public void PasswordTrue(){
        Assert.assertTrue("Uyarı ikonu geldi",isExist(PasswordTrue));
    }

    public void CheckPasswordErrorMessage(){
        Assert.assertTrue("Uyarı mesajı geldi",isExist(PasswordErrorMessage));
    }

    public void MyAccount(){
        click(MyAccount);
    }

}

