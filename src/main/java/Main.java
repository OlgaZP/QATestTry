import Homework2.BaseTest;
import Homework2.pages.DashboardPage;
import Homework2.pages.LoginPage;
import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.chrome.ChromeDriver;


public class Main extends BaseTest {
    public static void main (String[] args){

        System.out.println("test path "+BaseTest.class.getResource("../chromedriver.exe"));

        WebDriver driver = configuredChromeDriver();

    // Task 1. Test admin login
        LoginPage logPage = new LoginPage(driver);
        LoadWaiter();
        logPage.LoginAdminWithCorrectData();

        DashboardPage dashPage = new DashboardPage(driver);
        LoadWaiter();
        dashPage.HeaderLogout();

        LoadWaiter();
        driver.close();

    // Task 2. Test admin's main menu
        driver = configuredChromeDriver();
        logPage = new LoginPage(driver);
        LoadWaiter();
        logPage.LoginAdminWithCorrectData();

        dashPage = new DashboardPage(driver);
        LoadWaiter();

        //list loop for all main-menu items, get their names, load and reload page, compare titles
        dashPage.CheckMainMenuItems();

        driver.close();
    }







}
