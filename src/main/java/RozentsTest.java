import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RozentsTest {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://auto.ria.com/uk/search/?indexName=auto,order_auto,newauto_search&year[0].gte=2015&categories.main.id=1&brand.id[0]=55&model.id[0]=2228&country.import.usa.not=-1&price.currency=1&sort[0].order=price.asc&abroad.not=0&custom.not=1&page=0&size=20");




//        driver.get("https://rozetka.com.ua/");
//
//        driver.findElement(By.xpath("//*[@name='search']")).sendKeys("Iphone 14");
//        driver.findElement(By.xpath(" //*[text()=' Знайти ']")).click();
//        driver.findElement(By.xpath(" //*[@goods_id='352490631']")).click();
//        driver.findElement(By.xpath(" //*[@href='#icon-header-basket']//parent::*")).click();
//        driver.findElement(By.xpath(" //*[@href='https://rozetka.com.ua/ua/checkout/']")).click();
//        driver.findElement(By.xpath("//span[text()=' Курьер по вашему адресу ']")).click();




    }
}
