import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class FirstTest {
    private WebDriver driver;


    @Test
    public void myFirstTest() throws Exception {
        System.out.println("launching firefox browser");
        System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();

        final String url = "http://www.google.ru";

        driver.navigate().to(url);

        System.out.println("closing firefox browser");
        driver.quit();
        }
    }

