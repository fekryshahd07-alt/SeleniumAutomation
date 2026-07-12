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
        
        // 3. تسجيل الدخول
        driver.findElement(By.id("signin")).click();
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
        driver.findElement(By.id("react-select-2-input")).sendKeys("demouser");
        driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("react-select-3-input")).sendKeys("testingisfun99");
        driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("login-btn")).click();
        
        // 4. إضافة المنتج للسلة
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
        driver.findElement(By.className("shelf-item__buy-btn")).click();
        
        // 5. التحقق
        System.out.println("Login and Add to Cart process executed successfully!");
        
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        driver.quit();
    }
}