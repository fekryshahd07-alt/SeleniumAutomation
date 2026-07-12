package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestProductImage {

    public static void main(String[] args) {

        // تجهيز ChromeDriver
        WebDriverManager.chromedriver().setup();

        // فتح المتصفح بحجم الشاشة الكامل
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        // تشغيل Chrome
        WebDriver driver = new ChromeDriver(options);

        // فتح الموقع
        driver.get("https://bstackdemo.com/");

    }
}  