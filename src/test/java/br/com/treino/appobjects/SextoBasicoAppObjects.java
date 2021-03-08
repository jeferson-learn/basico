package br.com.treino.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SextoBasicoAppObjects {

    private final WebDriver driver;

    public SextoBasicoAppObjects (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement pesquisarTextField() {
        return driver.findElement(By.name("q"));
    }

    public WebElement pesquisarButton() {
        return driver.findElement(By.name("btnK"));
    }
}
