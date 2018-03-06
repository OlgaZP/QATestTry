package Homework2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    private By EmailInputField= By.id("email");
    private By PswdInputField= By.id("passwd");
    private By EnterBtm = By.name("submitLogin");

    public LoginPage (WebDriver driver){
        this.driver = driver;
    }

    public void LoginAdminWithCorrectData(){
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        WebElement EmailField = driver.findElement(EmailInputField);
        EmailField.sendKeys("webinar.test@gmail.com");

        WebElement PswdField = driver.findElement(PswdInputField);
        PswdField.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement EnterButtom = driver.findElement(EnterBtm);
        EnterButtom.click();
    }
}
