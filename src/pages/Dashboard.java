package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
    WebDriver driver;
    public Dashboard(WebDriver driver){
        this.driver=driver;
    }
    By logout=By.id("submit");
    public String displayTitle(){
        String title=driver.getTitle();
        return title;

    }
    public void clickLogout(){
        driver.findElement(logout).click();
    }
}
