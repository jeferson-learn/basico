package br.com.treino.frameworks.utlis;

import br.com.treino.frameworks.webdrivers.Browser;
import br.com.treino.frameworks.webdrivers.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class QuatroBasicoBaseTest extends DriverFactory {

//    public WebDriver driver;
//    DriverFactory driverFactory = new DriverFactory();

    @BeforeMethod
    public void setUp() {
        driver = createBrowser(Browser.CHROME);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
