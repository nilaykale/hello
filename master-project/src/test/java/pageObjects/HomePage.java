package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class=\"icon-close user-menu__log-out-icon\"]")
    private WebElement myAccount;
    @FindBy(xpath = "//*[@class=\"subheader-close js-subheader-close is-hidden\"]")
    private WebElement ClosePopUp;

    @FindBy(xpath = "//*[@class=\"main-eng js-load-complete\"]")
    private WebElement HESABIM_TITLE;

    @FindBy(xpath = "//*[@class=\"main-eng js-load-complete\"]")
    private WebElement Empty;

    @FindBy(xpath = "//*[@id=\"student_bodyDIV\"]/div/div[2]/div[2]/div")
    private WebElement NameTextExist;

    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[2]")
    private WebElement PopUp;

    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[3]/a/i")
    private WebElement MyProfileButton;

    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[2]/a/i")
    private WebElement DashboardButton;

    @FindBy(xpath = "//*[@id=\"student_bodyDIV\"]/div/div[2]/div[2]/div/div[10]")
    private WebElement RequestButton;

    @FindBy(xpath = "//*[@id=\"student_bodyDIV\"]/div[1]/div[2]/button")
    private WebElement NewRequestButton;

    @FindBy(xpath = "//*[@id=\"student_bodyDIV\"]/div[1]/div[2]/button")
    private WebElement hideMenu;

    @FindBy(id="gender")
    private WebElement Gender;

    @FindBy(xpath="//*[@id=\"gender\"]/option[2]")
    private WebElement Male;

    @FindBy(xpath="//*[@id=\"birthDate\"]")
    private WebElement enter_Day_Mount_Day;

    @FindBy(xpath="//*[@id=\"birthDate\"]")
    private WebElement dayfield;

    @FindBy(xpath="//*[@id=\"birthDate\"]")
    private WebElement monthfield;

    @FindBy(xpath="//*[@id=\"birthDate\"]")
    private WebElement yearfield;

    @FindBy(xpath="//*[@id=\"birthPlace\"]")
    private WebElement birthPlaceField;

    @FindBy(xpath="//*[@id=\"PI_BTN\"]")
    private WebElement SaveChanges;

    @FindBy(xpath="//*[@id=\"to\"]")
    private WebElement receiverfield;

    @FindBy(xpath="//*[@id=\"subject\"]")
    private WebElement subjectField;

    @FindBy(xpath="//*[@id=\"stRequest\"]")
    private WebElement requestField;

    @FindBy(xpath = "//*[@id=\"navbar-mobile\"]/ul[2]/li[1]/a/span[2]")
    private WebElement logoutSymbol;

    @FindBy(xpath = "//*[@id=\"navbar-mobile\"]/ul[2]/li[1]/div/a")
    private WebElement logoutButton;

    @FindBy(xpath = "//*[@id=\"signInDiv\"]/div[1]/h6")
    private WebElement welcome;

    public void ClickMyAccount() {
        Assert.assertTrue("-> Giris Yapilamadi!", isExist(HESABIM_TITLE));
        click(myAccount);
    }


    public void ClickEmpty() {
        click(Empty);
    }

    public void ClosePopUp() {
        tryClick(ClosePopUp);
    }
    public void HomePageURL(){
        Assert.assertTrue(isExist(NameTextExist));
    }

    public void CheckPopUp(){
        Assert.assertTrue("Personal Inforation Updated Successfully", isExist(PopUp));
    }

    public void MyProfile(){
        click(MyProfileButton);
    }
    public void Dashboard(){
        click(DashboardButton);
    }
    public void Request(){
        click(RequestButton);
    }

    public void NewRequest(){
        click(NewRequestButton);
    }

    public void Gender(){
        click(Gender);
    }

    public void Male() {
        click(Male);
    }

    public void SaveChanges(){
        click(SaveChanges);
    }

    public void enter_Day_Mount_Year(String day, String month, String year){
        sendKeys(dayfield, day);
        sendKeys(monthfield, month);
        sendKeys(yearfield, year);
    }

    public void choose_receiver(String receiver){
        sendKeys(receiverfield, receiver);
    }

    public void change_BirthPlace(String birthPlace ){
      clear(birthPlaceField);
      sendKeys(birthPlaceField,birthPlace);
    }

    public void subject(String subject, String request){
        sendKeys(subjectField,subject);
        sendKeys(requestField,request);
    }

    public void logOut(){
        click(logoutSymbol);
        click(logoutButton);
    }

    public void LoginPageURL(){
        Assert.assertTrue("Welcome back, please login to your account...\n", isExist(welcome));
    }

}
