package br.com.treino.testcases;

import br.com.treino.frameworks.utlis.QuatroBasicoBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class QuatroBasico extends QuatroBasicoBaseTest {

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
}
