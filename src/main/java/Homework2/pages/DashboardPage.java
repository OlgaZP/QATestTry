package Homework2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Homework2.BaseTest.LoadWaiter;

public class DashboardPage {
    private WebDriver driver;

    private By EmployeeDropdown=By.id("employee_infos");
    private By LogOutBtm=By.id("header_logout");
    private By MainMenuItms=By.className("maintab");

    public DashboardPage (WebDriver driver){

        this.driver = driver;
    }

    public void HeaderLogout() {

        driver.findElement(EmployeeDropdown).click();
        driver.findElement(LogOutBtm).click();
    }

    public void CheckMainMenuItems(){

        List<WebElement> MainMenuItems = driver.findElements(MainMenuItms);
        //System.out.println(MainMenuItems.size());
        int NumMainMenuItems=MainMenuItems.size();
        String PreviousTitle = "", ActualTitle="";

        for (int i=0; i<NumMainMenuItems; i++) {

            System.out.println(i+" Main menu item title is " + MainMenuItems.get(i).getText()); //driver.getTitle());
            MainMenuItems.get(i).click();
            PreviousTitle = driver.getTitle();
            System.out.println("Go to page and get the title " + PreviousTitle);
            driver.navigate().refresh();
            LoadWaiter();
            ActualTitle= driver.getTitle();
            System.out.println("Refresh page and get the title " + ActualTitle);
            if (PreviousTitle.equals(ActualTitle)){
                System.out.println("Test passed \n");
            }
            MainMenuItems = driver.findElements(MainMenuItms);
            //This "hack" for some pages with another main-menu-items class
            if (MainMenuItems.size()==0) {
                MainMenuItems = driver.findElements(By.className("link-levelone"));
            }
        }

    }

}
