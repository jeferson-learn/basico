package br.com.treino.frameworks.utlis;

import br.com.treino.frameworks.webdrivers.Browser;
import br.com.treino.frameworks.webdrivers.DriverFactory;
import br.com.treino.frameworks.webdrivers.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class QuintoBaseTest extends DriverFactory {

    @BeforeMethod
    public void setUp() {
        driver = createBrowser(Browser.CHROME);
        DriverManager.setDriver(driver);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.closeDriver();
    }

}
