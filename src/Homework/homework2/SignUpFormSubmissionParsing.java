package Homework.homework2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpFormSubmissionParsing {
    /**
     * open SignUpForm.html
     * fill in your data inside the all input elements
     * submit the form
     * get URL
     * parse values that was submitted and print them out
     * hint: https://examples.javacodegeeks.com/core-java/net/url/parse-url-example/
     * like nameOfTheInput = valueOfTheInput
     */
    public static void main(String[] args) {


     System.setProperty("webdriver.chrome.driver", "/Users/mohannaelhetawy/Desktop/Chromedriver/chromedriver");
    WebDriver driver = new ChromeDriver();
        driver.get("http://fiddle.jshell.net/daulet2030/2qfux1r7/show/");
}
