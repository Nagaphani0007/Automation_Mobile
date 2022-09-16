package phani.TestCases;

//package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sigin 
{
    static {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kanakamedala.phani\\eclipse-workspace\\selenium_1\\Soft\\chromedriver.exe");
    }
    WebDriver driver;
    @Test(priority = 1)
    public void launchBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com/");
        
    }
    @Test(priority = 2)    
    public void clickonsigninbutton() throws InterruptedException {
        driver.findElement(By.xpath("//button[normalize-space()='SIGN IN']")).click();
        Thread.sleep(1000);
    }
    @Test(priority = 3)
    public void enterUserName() throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys("Qualitest");
        Thread.sleep(1000);
    }
    @Test(priority = 4)
    public void enterPassword() throws InterruptedException {
        driver.findElement(By.id("password")).sendKeys("PaSSword");
        Thread.sleep(1000);
    }
    @Test(priority = 5)
    public void clickOnLogin_Quait() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Log In']")).click();
        Thread.sleep(000);
        driver.quit();
    }
    
}
