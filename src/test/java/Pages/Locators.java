package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends Parent {
    public Locators() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement cooky;

    @FindBy(css = "[data-placeholder='Kullanıcı Adı']")
    private WebElement username;

    @FindBy(css = "[data-placeholder='Parola']")
    private WebElement password;

    @FindBy(xpath = "//span[text()=' GİRİŞ YAP ']")
    private WebElement loginButton;

    @FindBy(xpath = "//span[text()=' Merhaba, Hüseyin Yılmaz ! '] ")
    private WebElement loginSuccess;

    @FindBy(xpath = "//div[contains(text(),'Invalid')]")
    private WebElement loginFailure;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {

            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {

            case "cooky":
                myElement = cooky;
                break;

            case "loginButton":
                myElement = loginButton;
                break;
        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {

            case "loginSuccess":
                myElement = loginSuccess;
                break;
            case "loginFailure":
                myElement = loginFailure;
                break;
        }
        verifyContainsText(myElement, text);
    }


}
