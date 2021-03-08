package br.com.treino.testcases;

import br.com.treino.frameworks.utlis.SextoBasicoBaseTest;
import br.com.treino.tasks.SextoBasicoTask;
import org.testng.annotations.Test;

public class SextoBasico extends SextoBasicoBaseTest {

    private SextoBasicoTask sextoBasicoTask;

    @Test
    public void googleTest() throws InterruptedException {
        sextoBasicoTask = new SextoBasicoTask(driver);
        /*OU usa linha 18 e tirar linhas 12 e 17*/
//        SextoBasicoTask sextoBasicoTask = new SextoBasicoTask(driver);

        driver.get("https://www.google.com.br");

        sextoBasicoTask.googlePesquisar();

    }
}
