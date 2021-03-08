package br.com.treino.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrimeiroBasico {

    private WebDriver driver;

    @Test
    public void googleTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com.br");

        WebElement elementoCampo = driver.findElement(By.name("q"));

        elementoCampo.sendKeys("Teste");

        WebElement elementoBotaoPesquisa = driver.findElement(By.name("btnK"));

        Thread.sleep(3000);

        elementoBotaoPesquisa.click();

        Thread.sleep(3000);

        driver.quit();
    }
}
