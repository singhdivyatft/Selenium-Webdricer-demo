package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class Gurupagehome {


    WebDriver driver;

    By homePageUserName = By.xpath("//table//tr[@class='heading3']");


    public Gurupagehome(WebDriver driver) {

        this.driver = driver;

    }

    //Get the User name from Home Page

    public String getHomePageDashboardUserName() {

        return driver.findElement(homePageUserName).getText();

    }
}
