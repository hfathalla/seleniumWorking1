package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty( "webdriver.chrome.driver", "/Users/mohannaelhetawy/Desktop/Chromedriver/chromedriver" );
            WebDriver driver = new ChromeDriver();
            driver.quit();
    }
}
