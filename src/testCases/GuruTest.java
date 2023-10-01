package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Gurupagehome;
import pages.Gurupagelogin;

import java.util.concurrent.TimeUnit;


        public class GuruTest {

        String driverPath = "C:\\geckodriver.exe";

        WebDriver driver;

        Gurupagelogin objLogin;

        Gurupagehome objHomePage;

        @BeforeTest

        public void setup(){

            System.setProperty("webdriver.gecko.driver", driverPath);

            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.get("http://demo.guru99.com/V4/");

        }

        /**

         * This test case will login in http://demo.guru99.com/V4/

         * Verify login page title as guru99 bank

         * Login to application

         * Verify the home page using Dashboard message

         */

        @Test(priority=0)

        public void test_Home_Page_Appear_Correct(){

            //Create Login Page object

            objLogin = new Gurupagelogin(driver);

            //Verify login page title

            String loginPageTitle = objLogin.getLoginTitle();

            Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

            //login to application

            objLogin.loginToGuru99("mngr530214", "sUpagAt");

            // go the next page

            objHomePage = new Gurupagehome(driver);

            //Verify home page

            Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mngr530214"));

        }
}
