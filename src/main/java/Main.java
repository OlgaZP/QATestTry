import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main (String[] args){
        WebDriver driver = initChromeDriver();

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        WebElement EmailField=driver.findElement(By.id("email"));
        EmailField.sendKeys("webinar.test@gmail.com");

        WebElement PswdField=driver.findElement(By.id("passwd"));
        PswdField.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement EnterButtom=driver.findElement(By.name("submitLogin"));
        EnterButtom.click();

        driver.close();
    }

    public static WebDriver initChromeDriver(){
        //get driver path property
       // String driverPath = System.getProperty("driver.executable");
      //  if (driverPath == null)
       //     throw new SkipExeption ("PAth to ChromeDriver is not specified!");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
        return new ChromeDriver();

    }
}
