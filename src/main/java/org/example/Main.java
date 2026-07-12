package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {
    public static void main(String[] args) {
        // 1. تجهيز المتصفح
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // 2. فتح الموقع
        driver.get("https://bstackdemo.com/");
        
        // 3. الضغط على زر Sign In
        driver.findElement(By.id("signin")).click();
        
        // 4. خطوة انتظار بسيطة (لضمان تحميل القائمة)
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }

        // 5. إدخال الـ Username
        driver.findElement(By.id("react-select-2-input")).sendKeys("demouser");
        driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);

        // 6. إدخال الـ Password
        driver.findElement(By.id("react-select-3-input")).sendKeys("testingisfun99");
        driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);

        // 7. الضغط على زر Log In
        driver.findElement(By.id("login-btn")).click();
        
        System.out.println("Login process executed successfully!");
        
        // 8. إغلاق المتصفح بعد 3 ثواني
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        driver.quit();
    }
}