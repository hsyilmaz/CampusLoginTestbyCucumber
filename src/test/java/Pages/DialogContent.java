package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    private WebElement registerbtnHome;

    @FindBy(id = "customer.firstName")
    private WebElement firstname;

    @FindBy(id = "customer.lastName")
    private WebElement lastname;
    @FindBy(id = "customer.address.street")
    private WebElement addresStreet;
    @FindBy(id = "customer.address.city")
    private WebElement addressCity;
    @FindBy(id = "customer.address.state")
    private WebElement addressState;

    @FindBy(id = "customer.address.zipCode")
    private WebElement addressZipCode;
    @FindBy(id = "customer.phoneNumber")
    private WebElement phoneNumber;
    @FindBy(id = "customer.ssn")
    private WebElement ssn;
    @FindBy(id = "customer.username")
    private WebElement registerUsername;
    @FindBy(id = "customer.password")
    private WebElement registerPassword;
    @FindBy(id = "repeatedPassword")
    private WebElement registerRepeatedPassword;
    @FindBy(css = "[value='Register']")
    private WebElement registerButton;
    @FindBy(xpath = "//*[contains(text(),'successfully')]")
    private WebElement registerValidate;

    @FindBy(name = "username")
    private WebElement username;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(css = "[value='Log In']")
    private WebElement loginButton;
    @FindBy(css = "h1[class='title']")
    private WebElement loginVerify;
    @FindBy(css = "[class='error']")
    private WebElement loginUnVerify;

    @FindBy(linkText = "Bill Pay")
    private WebElement billpayButton;

    @FindBy(name = "payee.name")
    private WebElement payeeName;

    @FindBy(name = "payee.address.street")
    private WebElement payeeAddress;

    @FindBy(name = "payee.address.city")
    private WebElement payeecity;

    @FindBy(name = "payee.address.state")
    private WebElement payeestate;

    @FindBy(name = "payee.address.zipCode")
    private WebElement payeezipCode;

    @FindBy(name = "payee.phoneNumber")
    private WebElement payeePhone;

    @FindBy(name = "payee.accountNumber")
    private WebElement payeeAccount;

    @FindBy(name = "verifyAccount")
    private WebElement payeeVerifyAccount;

    @FindBy(name = "amount")
    private WebElement payeeAmount;

    @FindBy(name = "fromAccountId")
    private WebElement payeeSelectAccount;

    @FindBy(css = "[value='Send Payment']")
    private WebElement payeePayment;

    @FindBy(xpath = "//*[text()='Bill Payment Complete']")
    private WebElement paymentVerify;


    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "firstname":
                myElement = firstname;
                break;
            case "lastname":
                myElement = lastname;
                break;

            case "addresStreet":
                myElement = addresStreet;
                break;
            case "addressCity":
                myElement = addressCity;
                break;
            case "addressState":
                myElement = addressState;
                break;
            case "phoneNumber":
                myElement = phoneNumber;
                break;

            case "addressZipCode":
                myElement = addressZipCode;
                break;
            case "ssn":
                myElement = ssn;
                break;
            case "registerUsername":
                myElement = registerUsername;
                break;
            case "registerPassword":
                myElement = registerPassword;
                break;
            case "registerRepeatedPassword":
                myElement = registerRepeatedPassword;
                break;
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
            case "payeeName":
                myElement = payeeName;
                break;
            case "payeeAddress":
                myElement = payeeAddress;
                break;
            case "payeecity":
                myElement = payeecity;
                break;
            case "payeestate":
                myElement = payeestate;
                break;
            case "payeezipCode":
                myElement = payeezipCode;
                break;
            case "payeePhone":
                myElement = payeePhone;
                break;
            case "payeeAccount":
                myElement = payeeAccount;
                break;
            case "payeeVerifyAccount":
                myElement = payeeVerifyAccount;
                break;
            case "payeeAmount":
                myElement = payeeAmount;
                break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "registerbtnHome":
                myElement = registerbtnHome;
                break;
            case "registerButton":
                myElement = registerButton;
                break;
            case "loginButton":
                myElement = loginButton;
                break;
            case "billpayButton":
                myElement = billpayButton;
                break;
            case "payeePayment":
                myElement = payeePayment;
                break;

        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {
            case "registerValidate":
                myElement = registerValidate;
                break;
            case "loginVerify":
                myElement = loginVerify;
                break;
            case "loginUnVerify":
                myElement = loginUnVerify;
                break;
            case "paymentVerify":
                myElement = paymentVerify;
                break;
        }
        verifyContainsText(myElement, text);
    }


}
