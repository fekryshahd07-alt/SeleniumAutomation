

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://bstackdemo.com/");
        driver.findElement(By.id("search-input")).sendKeys("iPhone", Keys.ENTER);
        System.out.println("Search Test Finished.");
        driver.quit();
    }
}