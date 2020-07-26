package meetup.reprograma.pages;

import meetup.reprograma.utils.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(., 'Welcome')]")
    private WebElement msgWelcomeAdmin;

    public boolean valid_message_welcome() {
        return Helper.element_exist(msgWelcomeAdmin, 10);
    }

}
