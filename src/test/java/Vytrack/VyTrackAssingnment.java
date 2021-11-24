package Vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VyTrackAssingnment {

    @Test
    public void Login(){
        //setup browser
        WebDriverManager.chromedriver().setup();
        //create driver
        WebDriver driver = new ChromeDriver();
        String loginPageUrl = "https://qa2.vytrack.com/user/login";

        //maximizing browser
        driver.manage().window().maximize();

        //adding implicit wait
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //get to login page
        driver.get(loginPageUrl);

        //enter username
        WebElement userName = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userName.sendKeys("user27");

        //enter password
        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");

        //finding click button
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='_submit']"));
        loginButton.click();

    }


}
