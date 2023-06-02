package CodingTestingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ParallelTesting {
    WebDriver driver;
    @Test
    public void test11() {
       System.setProperty("webdriver.chrome.driver", "/Users/sharanbasveshwarsmathpati/Downloads/SeleniumProject/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement ele=driver.findElement(By.cssSelector("#txtUsername"));
        ele.sendKeys("Admin");

        WebElement ele1= driver.findElement(By.cssSelector("#txtPassword"));
        ele1.sendKeys("admin123");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        System.out.println("Welcome test1");

    }
}

