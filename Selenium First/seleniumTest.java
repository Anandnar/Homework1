import com.sun.org.apache.xpath.internal.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class seleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Implicit wait applied
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        //Navigate to website
        driver.get("https://demo.nopcommerce.com/");

        //Click on register button for new register user
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        //Type first name
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("TestABCD");

        //Type last name
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("PQRS");
        //Type email id.
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Testtest1@test.com");

        //Type password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Test1234");

        //Type confirm password
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Test1234");

        //Click on register button
        driver.findElement(By.xpath("//input[@id='register-button'")).click();
        //Actual msg 'Your registration completed'
        String actualregistration = (String) driver.findElement(By.xpath("//div[class='result']"));
        Assert.assertEquals("User should be",actualregistration);
    }
}
