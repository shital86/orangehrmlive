package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
       System.out.print("The Page Resource: "+driver.getPageSource());
        String title = driver.getTitle();
        System.out.println("Title of the Page:" + title);
        System.out.println("Current Url:" + driver.getCurrentUrl());

        WebElement userField = driver.findElement(By.id("txtUsername"));
        System.out.println(userField);
        userField.sendKeys("Admin");
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        System.out.println(passwordField);
        passwordField.sendKeys("admin123");

    }
}
