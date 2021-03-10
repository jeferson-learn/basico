package br.com.treino.testcases;

import br.com.treino.frameworks.utlis.SextoBasicoBaseTest;
import br.com.treino.tasks.SextoBasicoTask;
import com.aventstack.extentreports.ReportService;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SextoBasico extends SextoBasicoBaseTest {
    /* não funciona */
//    private SextoBasicoTask sextoBasicoTask = new SextoBasicoTask(driver);
    private SextoBasicoTask sextoBasicoTask;

    @Test
    public void googleTest() throws InterruptedException {
        sextoBasicoTask = new SextoBasicoTask(driver);
        /* OU usa esse e nao precisa private */
//        SextoBasicoTask sextoBasicoTask = new SextoBasicoTask(driver);

        driver.get("https://www.google.com.br");

        Assert.assertEquals("Google", driver.getTitle());

        ExtentTestManager.getTest().log(Status.INFO, "A navegador está abrindo e a pagina GOOGLE");

        sextoBasicoTask.googlePesquisar();

        ExtentTestManager.getTest().log(Status.INFO, "A navegador está fechando e terminando do teste");

    }
}
