package Homework2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

    public static WebDriver initChromeDriver(){
        //get driver path property
        // String driverPath = System.getProperty("driver.executable");
        //  if (driverPath == null)
        //     throw new SkipExeption ("Path to ChromeDriver is not specified!");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
        return new ChromeDriver();

    }

    public static WebDriver configuredChromeDriver(){
        WebDriver driver = initChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static void LoadWaiter(){

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
