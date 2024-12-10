package com.solvd.example.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SauceProductsPage {
    private WebDriver driver;
    @FindBy(css = ".inventory_item_name")
    private List<WebElement> productsNames;

    public SauceProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void printProductsNames(){
        productsNames
                .forEach(p-> System.out.println(p.getText()));
    }

    public List<WebElement> getProductsNames() {
        return productsNames;
    }
}
