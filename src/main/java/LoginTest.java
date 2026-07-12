
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) {
        // 1. إعداد الدرايفر
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // 2. فتح الموقع
        driver.get("https://bstackdemo.com/");
        
        // 3. النقر على زر تسجيل الدخول
        driver.findElement(By.id("signin")).click();
        
        // 4. إدخال اليوزر نيم (كمثال)
        driver.findElement(By.id("username")).sendKeys("demouser");
        
        // 5. إدخال الباسورد
        driver.findElement(By.id("password")).sendKeys("testingisfun@@1");
        
        // 6. الضغط على زر الدخول
        driver.findElement(By.id("login-btn")).click();
        
        System.out.println("Login Test Finished.");
        
        // 7. إغلاق المتصفح
        try { Thread.sleep(2000); } catch (Exception e) {}
        driver.quit();
    }
}