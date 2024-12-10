package com.solvd.example.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SaucePageTest {
    @Test
    public void verifyLoginTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");


        SauceLoginPage loginPage = new SauceLoginPage(driver);
        loginPage.typeUserName("standard_user");
        loginPage.typePassword("secret_sauce");
        SauceProductsPage sauceProductsPage = loginPage.clickOnLoginButton();
        //int productsListSize = sauceProductsPage.getProductsNames().size();
        //Assert.assertTrue(productsListSize > 0, "Products list is empty");
        sauceProductsPage.printProductsNames();

        driver.close();
    }
}
