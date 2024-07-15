package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Attributes_id_name_classname {


    public static void main(String[] args) throws InterruptedException {

//TODO 1-Create New Object of WebDriver to open Chrome
        WebDriver driver = new ChromeDriver();


//TODO 2-Configure your driver
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();

//TODO 3- Navigate to the website
        driver.navigate().to("http://the-internet.herokuapp.com/login");


        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");

// Note: special case for class name:
// if the class name contains spaces, you ought to select part of the class name
// e.x: class="fa fa-2x fa-sign-in"  >> you could select "fa" or "fa-2x"  or "fa-sign-in"
        driver.findElement(By.className("fa-sign-in")).click();

        Thread.sleep(2000);

        driver.quit();


    }
}
