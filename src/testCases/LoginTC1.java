package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Dashboard;
import pages.Homepage;
import pages.Loginpage;

public class LoginTC1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/books");
        Homepage hp=new Homepage(driver);
        Loginpage lp=new Loginpage(driver);
        Dashboard db=new Dashboard(driver);
        hp.clickLogin();
        lp.enterUsername("divsin@16");
        lp.enterPass("Divsin@16");
        lp.clickLogin();
        //lp.clickNewuser();
        Thread.sleep(3000);
        System.out.println("the title is "+db.displayTitle());
        db.clickLogout();



    }
}
