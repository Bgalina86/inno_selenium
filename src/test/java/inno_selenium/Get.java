package inno_selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {

    private WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        // WebDriver driver = new EdgeDriver();
        //WebDriver driver = new SafariDriver(); не установлен браузер - тест не запуститься
    }

    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }

    }


  @Test
  public void getDemo(){

        driver.get("https://trudvsem.ru/");
    }

}
