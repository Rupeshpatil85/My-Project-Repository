package Test_Scenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import Object.objectBatPrice; // Import the objectBatPrice class

public class BatPrice {
    WebDriver driver;

    @BeforeTest
    public void BeforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupes\\IdeaProjects\\MRF_BAT_PRICE_SHOW\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
    }

    @Test
    public void AfterTest() {
        // Creating an instance of the objectBatPrice class
        objectBatPrice page = new objectBatPrice(driver);

        // Call methods of objectBatPrice class as per your test scenario
        page.Clickable();
        page.mrfBat();
        page.ButtonClick();
        String price = page.ShowPrice();
        System.out.println("Price of the first bat: " + price);
    }
}
