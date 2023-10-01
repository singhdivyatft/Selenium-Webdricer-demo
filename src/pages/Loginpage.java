package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage{
    WebDriver driver;

    public Loginpage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    By username= By.xpath("//input[@id='userName']");
    By password=By.id("password");
    //By loginbtn=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[1]/button[1]");
    //By loginBtn = By.xpath("//button[@id='login']");
    @FindBy(id="login")
    WebElement loginBtn;
    By newUser=By.name("newUser");
    public void enterUsername(String user){
        driver.findElement(username).sendKeys(user);
    }
    public void enterPass(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public void clickLogin(){
        loginBtn.click();
    }
    public void clickNewuser(){
        driver.findElement(newUser).click();
    }
}
