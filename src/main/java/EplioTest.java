import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EplioTest {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get("https://eplio.com.ua/ua");
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@data-href='#mnavc157']")).click();
        List<WebElement> checkbox = driver.findElements(By.xpath("//div[@id='ocf-filter-104-2-1']//span[@class='ocf-value-input ocf-value-input-checkbox']"));
     //  checkbox.get(6).click();
//        System.out.println(checkbox.size());
//        if(checkbox.size() == 3 )
//            System.out.println("Размерность бокса "+ checkbox.size());
//            else System.out.println("Размерность чекбокса 5");
        for (WebElement checkbooks : checkbox) {
            checkbooks.click();

        }
    }
}

//        selectedCheckBox("IMAC");
//        selectedCheckBox("APPLE WATCH");
//    }
//    public static void selectedCheckBox(String name){
//        String rbXpath="//*[text()='iPhone']//preceding-sibling::span";
//        if(!driver.findElement(By.xpath(String.format(rbXpath,name))).isSelected())
//            driver.findElement(By.xpath(String.format(rbXpath,name))).click();
//    }


// WebElement button = driver.findElement(By.xpath("//*[@data-href='#mnavc59']"));
////       button.click();
////       driver.findElement(By.xpath("//*[@src='https://eplio.com.ua/image/cache/webp/catalog/Apple%20new/iphone14promax-365x299.webp']")).click();
////       driver.findElement(By.xpath("//a[contains(text(),'New Apple iPhone 14 Pro Max 128Gb Deep Purple ')]/parent::*//following-sibling::*[5]")).click();
////       driver.findElement(By.xpath("//*[text()='Оформление заказа']")).click();
////        driver.findElement(By.xpath("// *[@name='customer[firstname]']")).sendKeys("Ivan");
////        driver.findElement(By.xpath("  //*[@name='customer[telephone]'] ")).sendKeys("+38088558855");
////        WebElement button1 = driver.findElement(By.xpath("//*[@class='content__title content__title_checkout']"));
////        System.out.println(driver.findElement(By.xpath("  //*[@name='customer[telephone]'] ")).getAttribute("value"));
////
//        //        if (button1.getText().equals("Оформлення замовлення")) {
////            System.out.println("Success!");
////        }else System.out.println("Fail");
//        //  driver.quit();