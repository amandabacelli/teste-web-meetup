package meetup.reprograma.pages;

import meetup.reprograma.utils.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {

    //TODO definir como iremos interagir com os elementos
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //TODO descrever os elementos que foram mapeados

    @FindBy(id = "username")
    private WebElement inputUsername;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Sign In']")
    private WebElement btnSignIn;

    @FindBy(xpath = "//span[contains(., 'Welcome Admin!')]")
    private WebElement msgWelcomeAdmin;

    //TODO descrever os métodos

    public void input_username(String username) {
        inputUsername.sendKeys(username);
    }

    public void input_password(String password) {
        inputPassword.sendKeys(password);
    }

    public void click_btn_login() {
        btnSignIn.click();
    }

    public boolean valid_page() {
        Helper.waiting_element(10, btnSignIn);
        return btnSignIn.isDisplayed();
    }

    public boolean valid_message_welcome_admin() {
        return Helper.element_exist(msgWelcomeAdmin, 10);
    }

}

