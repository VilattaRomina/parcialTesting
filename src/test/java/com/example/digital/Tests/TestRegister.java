package com.example.digital.Tests;

import com.example.digital.Pages.RegisterPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestRegister {

    private WebDriver driver;
    RegisterPage pageregister;

    @BeforeEach
    public void setUp() throws Exception {
        pageregister = new RegisterPage(driver);
        driver = pageregister.chromeDriverConnection();
        pageregister.link("https://opencart.abstracta.us/index.php?route=common/home");
    }

    @AfterEach
    public void exit() {

        driver.quit();
    }
    @Test
    public void test() throws InterruptedException {
        pageregister.registerUser();
    }
}
