package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class CloseAndQuit {
    public static void main(String[] args) {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromiumDriver();
//        driver.get("https:// practice.cyberteksschool.com");
//        Thread.sleep(3000);
//        driver.close();

driver.get("https://practice.cybertekschool.com/open_new_tab");
Thread.sleep(5000);
driver.close();
driver.quit();

    }
}
