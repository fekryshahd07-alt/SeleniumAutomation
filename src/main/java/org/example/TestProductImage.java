package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestProductImage {
    public static void main(String[] args) throws InterruptedException {
        // تهيئة المشغل
        WebDriverManager.chromedriver().setup();
        
        // إضافة خيارات لإجبار المتصفح على الظهور
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // لفتح المتصفح بحجم الشاشة الكاملة
        
        // تشغيل الدرايفر مع الخيارات
        WebDriver driver = new ChromeDriver(options);
        
        // الانتقال للموقع
        driver.get("https://bstackdemo.com/");
        
        System.out.println("تم فتح الموقع بنجاح يا شاهِد، المفروض يكون ظاهر أمامك الآن!");
        
        // الانتظار 10 ثوانٍ لرؤية الموقع
        Thread.sleep(10000); 
        
        // إغلاق المتصفح
        driver.quit();
    }
}