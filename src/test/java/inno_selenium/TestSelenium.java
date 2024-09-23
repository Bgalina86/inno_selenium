package inno_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestSelenium {
    public static void main(String [] args){

        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
       // WebDriver driver = new EdgeDriver();
        //WebDriver driver = new SafariDriver(); не установлен браузер - тест не запуститься
       if (driver != null){
           driver.quit();}

    }

}
