package com.example.digital.Pages;

import com.example.digital.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListPage extends BasePage {

    By searchBox = By.xpath("/html/body/header/div/div/div[2]/div/input");


    By searchButton = By.xpath("/html/body/header/div/div/div[2]/div/span/button");

    By cartButton = By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[2]/div[2]/button[1]");

    By message = By.xpath("/html/body/div[2]/div[1]");

    public ProductListPage(WebDriver driver) {

    }


    public void buyProduct() throws InterruptedException{
        teclear("Iphone", searchBox);
        Thread.sleep(100);
        clickear(searchButton);
        Thread.sleep(100);
        clickear(cartButton);
        Thread.sleep(1000);
        compare(message, "Success: You have added iPhone to your shopping cart!");
        /*waitForTextToBePresent(resultMessage,"Success: You have added iPhone to your shopping cart!",10);*/


    }
}
