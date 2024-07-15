package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Attributes_linkText_partialLinkText {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.navigate().to("http://the-internet.herokuapp.com/login");

        driver.findElement(By.linkText("Elemental Selenium")).click();
//or
// driver.findElement(By.partialLinkText("Elemental Selen")).click();

        Thread.sleep(2000);


        driver.quit();


    }
}
