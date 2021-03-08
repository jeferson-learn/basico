package br.com.treino.tasks;

import br.com.treino.appobjects.SextoBasicoAppObjects;
import org.openqa.selenium.WebDriver;

public class SextoBasicoTask {

    private final WebDriver driver;
    private final SextoBasicoAppObjects sextoBasicoAppObjects;

    public SextoBasicoTask (WebDriver driver) {
        this.driver = driver;
        sextoBasicoAppObjects = new SextoBasicoAppObjects(driver);
    }

    public void googlePesquisar() throws InterruptedException {
        sextoBasicoAppObjects.pesquisarTextField().sendKeys("teste");
        Thread.sleep(3000);
        sextoBasicoAppObjects.pesquisarButton().click();
    }
}
