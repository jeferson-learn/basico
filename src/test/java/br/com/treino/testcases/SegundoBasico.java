package br.com.treino.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SegundoBasico {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void googleTest() throws InterruptedException {

        driver.get("https://www.google.com.br");

        WebElement elementoCampo = driver.findElement(By.name("q"));

        elementoCampo.sendKeys("Teste");

        WebElement elementoBotaoPesquisa = driver.findElement(By.name("btnK"));

        Thread.sleep(3000);

        elementoBotaoPesquisa.click();

        Thread.sleep(3000);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
