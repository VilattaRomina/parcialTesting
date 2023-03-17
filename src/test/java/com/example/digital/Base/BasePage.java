package com.example.digital.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected static WebDriver driver;
    protected WebDriverWait wait;

    public WebDriver chromeDriverConnection() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        return driver;
    }
    public void teclear(String imputText,By locator) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(imputText);
    }
    public static void clickear(By locator) {
        driver.findElement(locator).click();
    }
    public void link (String url) {
        driver.get(url);
    }
    public void compare(By locator, String texto) {
        String res = driver.findElement(locator).getText();
        assert(res.contains(texto));
    }
    public void waitForTextToBePresent(By locator, String texto, int tiempo) {
        new WebDriverWait(driver,Duration.ofSeconds(tiempo))
                .until(ExpectedConditions.textToBe(locator,texto ));
    }
}
