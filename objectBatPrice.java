package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class objectBatPrice {
    WebDriver driver;

    public objectBatPrice (WebDriver driver){
        this.driver = driver;
    }
    By SearchClick = By.xpath("//input[@type='text']");
    By InputClick = By.xpath("//input[@type='text']");
    By SearchButtonClick = By.xpath("//input[@id='nav-search-submit-button']");

    By RetrivePrice = By.xpath("(//span[@class='a-price-whole'])[1]");
    public void Clickable (){
        driver.findElement(SearchClick).click();
    }
    public void mrfBat(){
        driver.findElement(InputClick).sendKeys("Mrf Bats");
    }
    public void ButtonClick(){
        driver.findElement(SearchButtonClick).click();
    }

    public String ShowPrice(){
        return driver.findElement(RetrivePrice).getText();
    }

}

