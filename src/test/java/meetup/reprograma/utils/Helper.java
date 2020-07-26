package meetup.reprograma.utils;

import meetup.reprograma.setup.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {

    public static void waiting_element(int timeout, WebElement element) {
        WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static boolean element_exist(WebElement element, int timeout) {
        try {
            waiting_element(timeout, element);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
