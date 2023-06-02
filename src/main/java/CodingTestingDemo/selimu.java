package CodingTestingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Map;

import static org.testng.Assert.assertEquals;

public class selimu {
    WebDriver driver;
    @Test(priority = 1,dataProvider ="csvReaders,dataProviderClass=CsvDataProviders.class")
    public  void navigationTests(Map testData) throws InterruptedException{
        String VerificationLevel= (String) testData.get("verification");
        String frame= (String) testData.get("frame");
        if(!frame.isEmpty())
        driver.switchTo().frame(frame);
        WebElement i= (WebElement) driver.findElements(By.tagName("body"));
        String p=i.getText();
        assertEquals(p.contains(VerificationLevel),true);


    }
}
