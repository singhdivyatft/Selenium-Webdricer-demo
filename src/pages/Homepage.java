package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
    WebDriver driver;
    public Homepage(WebDriver driver){
        this.driver=driver;
    }
    By loginbtn=By.id("login");
    public void clickLogin(){
        driver.findElement(loginbtn).click();
    }
}
