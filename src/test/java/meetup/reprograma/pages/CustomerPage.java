package meetup.reprograma.pages;

import meetup.reprograma.setup.Hooks;
import meetup.reprograma.utils.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {

    public CustomerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li/a[@data-toggle='#BLCCustomerCare']")
    private WebElement menuCustomersCare;

    @FindBy(xpath = "//*[@id='BLCCustomerCare']//li/a[@href='/admin/customer']")
    private WebElement menuCustomers;

    @FindBy(xpath = "//button[contains(@data-url, 'customer')]")
    private WebElement btnAddCustomer;

    @FindBy(xpath = "//input[@name=\"fields['emailAddress'].value\"]")
    private WebElement inputEmailAddress;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSave;

    @FindBy(xpath = "//a[@class='back-button']")
    private WebElement btnBack;

    @FindBy(xpath = "(//div/h3)[3]")
    private WebElement msgEmail;

    @FindBy(xpath = "//a[@href='/admin/customer/7117']")
    private WebElement clickEmail;

    public void enter_menu_customers() {
        menuCustomersCare.click();
        Helper.element_exist(menuCustomersCare, 10);
        menuCustomers.click();
    }

    public void add_new_customer(String email) {
        btnAddCustomer.isDisplayed();
        btnAddCustomer.click();
        Helper.element_exist(inputEmailAddress, 10);
        inputEmailAddress.sendKeys(email);
        btnSave.click();
    }


    public boolean valid_customer(String email) {
        Helper.element_exist(msgEmail,10);
        String getEmail = msgEmail.getText();
        return getEmail.equals(email);
    }

    public void click_customer() {
        Helper.element_exist(clickEmail,10);
        clickEmail.click();
    }

}
