

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAndCartTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://bstackdemo.com/");

        // Login
        driver.findElement(By.id("signin")).click();
        try { Thread.sleep(2000); } catch (Exception e) {}
        driver.findElement(By.id("react-select-2-input")).sendKeys("demouser", Keys.ENTER);
        driver.findElement(By.id("react-select-3-input")).sendKeys("testingisfun99", Keys.ENTER);
        driver.findElement(By.id("login-btn")).click();

        // Add to Cart
        try { Thread.sleep(2000); } catch (Exception e) {}
        driver.findElement(By.className("shelf-item__buy-btn")).click();

        System.out.println("Test Passed: Login and Add to Cart successful!");

        driver.quit();
    }
}