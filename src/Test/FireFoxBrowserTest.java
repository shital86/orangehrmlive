package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        System.out.println("Resource Page:" +driver.getPageSource());
        String title=driver.getTitle();
        System.out.println("Title of the Page:" +title);
        System.out.println("Current Url:" +driver.getCurrentUrl());
        WebElement usernameField=driver.findElement(By.id("txtUsername"));
        System.out.println(usernameField);
        usernameField.sendKeys("Admin");
        WebElement passwordField=driver.findElement(By.name("txtPassword"));
        System.out.println(passwordField);
        passwordField.sendKeys("admin123");
        //String homepageUrl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        //driver.navigate().to(homepageUrl);
        //driver.close();
    }
    }








