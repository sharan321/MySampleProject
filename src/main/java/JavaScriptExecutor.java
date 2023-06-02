import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
    public static void main(String[] args) {

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "/Users/sharanbasveshwarsmathpati/Downloads/SeleniumProject/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        JavaScriptExecutor JS=  (JavaScriptExecutor)driver;
        //JS.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

    }
}
