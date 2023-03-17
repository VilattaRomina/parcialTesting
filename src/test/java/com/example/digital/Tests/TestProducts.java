package com.example.digital.Tests;

import com.example.digital.Pages.ProductListPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestProducts {

	WebDriver driver;
	ProductListPage productListPage;

	@BeforeEach
	public void setUp() throws Exception {
		productListPage = new ProductListPage(driver);
		driver = productListPage.chromeDriverConnection();
		productListPage.link("https://opencart.abstracta.us/index.php?route=common/home");
	}
	@AfterEach
	public void exit() {
		driver.quit();
	}
	@Test
	public void test() throws InterruptedException {
		productListPage.buyProduct();
	}

}