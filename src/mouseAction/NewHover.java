package mouseAction;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class NewHover {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver driver=new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver","C:\\Web drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //((JavascriptExecutor) driver).executeScript("scroll(0,300)");
        Actions act=new Actions(driver);
        WebElement user= driver.findElement(By.id("email"));
        user.sendKeys("Admin@gmail.com");
        WebElement pass= driver.findElement(By.id("pass"));
        pass.sendKeys("adminjfue");
        //act.moveToElement(pass).build().perform();
        //WebElement loginbtn= driver.findElement(By.name("login"));
        WebElement ele= driver.findElement(By.name("login"));
//        Point point = ele.getLocation();
//        int xcord = point.getX();
//        int ycord = point.getY();
//        System.out.println(xcord+" "+ycord);
        act.moveToElement(ele).click().build().perform();
        Thread.sleep(3000);



    }
}
