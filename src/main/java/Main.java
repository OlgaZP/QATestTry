import Homework2.BaseTest;
import Homework2.pages.DashboardPage;
import Homework2.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main extends BaseTest {
    public static void main (String[] args){

        WebDriver driver = configuredChromeDriver();

    // Task 1. Test admin login
        LoginPage logPage = new LoginPage(driver);
        logPage.LoginAdminWithCorrectData();

        LoadWaiter();

        DashboardPage dashPage = new DashboardPage(driver);
        dashPage.HeaderLogout();

        LoadWaiter();
        driver.close();

    // Task 2. Test admin's main menu
        driver = configuredChromeDriver();
        logPage = new LoginPage(driver);
        logPage.LoginAdminWithCorrectData();

        dashPage = new DashboardPage(driver);
        LoadWaiter();

        //list loop for all main-menu items, get their names, load and reload page, compare titles
        dashPage.CheckMainMenuItems();

        driver.close();
    }







}
