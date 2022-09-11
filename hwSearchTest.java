package lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class hwSearchTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
            public void testLocator(){
        driver.findElement(By.id("search_query_top"));
        driver.findElement(By.cssSelector("#search_query_top"));// optimal'ny po id
        driver.findElement(By.cssSelector(".search_query.form-control.ac_input"));
        driver.findElement(By.cssSelector("[placeholder='Search']"));
        driver.findElement(By.cssSelector("[class*='search_query']"));
        driver.findElement(By.cssSelector("[name='search_query']"));
        driver.findElement(By.cssSelector("[class$=ac_input]"));
        driver.findElement(By.xpath("//input[@id='search_query_top']"));
        driver.findElement(By.xpath("//div/form/input[4]"));
        driver.findElement(By.xpath("//*[@class='search_query form-control ac_input']"));
       



    }


    @AfterMethod(enabled = false)
    public void tearDawn() {
        driver.quit();
    }
}
