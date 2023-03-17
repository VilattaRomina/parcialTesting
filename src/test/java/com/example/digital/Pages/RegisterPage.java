package com.example.digital.Pages;
import com.example.digital.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage  extends BasePage {
    By SignUpButton = By.linkText("My Account");
    By ButtonRegister = By.linkText("Register");
    By inputFirstName = By.name("firstname");
    By inputLastName = By.id("input-lastname");
    By inputEmail = By.id("input-email");
    By inputTelephone = By.id("input-telephone");
    By inputPassword = By.xpath("//*[@id=\"input-password\"]");
    By inputConfirmPassword = By.xpath("//*[@id=\"input-confirm\"]");
    By NoSuscribe = By.xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[2]/input");
    By Policy = By.name("agree");
    By ButtonCotinue = By.cssSelector("input.btn");
    By Result = By.xpath("/html/body/div[2]/div/div/p[1]");

    public RegisterPage(WebDriver driver) {

    }
    public void registerUser(){

        clickear(SignUpButton);
        clickear(ButtonRegister);
        teclear("Isabela", inputFirstName);
        teclear("Garcia", inputLastName);
        teclear("isabelagarcia@gmail.com", inputEmail);
        teclear("98463299", inputTelephone);
        teclear("9876549", inputPassword);
        teclear("9876549", inputConfirmPassword);
        clickear(NoSuscribe);
        clickear(Policy);
        clickear(ButtonCotinue);

        waitForTextToBePresent(Result,"Congratulations! Your new account has been successfully created!",10);

    }

}
