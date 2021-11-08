package assignment3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FadimeTestingHr19Login {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String url = "https://login2.nextbasecrm.com";
        driver.manage().window().maximize();

        driver.get(url);
        System.out.println("Url is open");
        Thread.sleep(2000);

        WebElement emailField = driver.findElement(By.name("USER_LOGIN"));
        emailField.sendKeys("marketing19@cybertekschool.com" + Keys.ENTER);

        Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("UserUser" );

        System.out.println("User name and password clicked successfully");

        WebElement clickButton = driver.findElement(By.className("login-btn"));
        clickButton.click();
        System.out.println("Successfully logged in");

        String currentlUrl = "https://login2.nextbasecrm.com/stream/?login=yes";
        String expectedUrl =  "https://login2.nextbasecrm.com/";


        if(currentlUrl.contains(expectedUrl)){
            System.out.println("Current url verified");
        }else{
            System.out.println("Current url not verified");
        }

        WebElement marketing = driver.findElement(By.id("user-name" ));
        marketing.click();

        Thread.sleep(2000);
        WebElement logOut = driver.findElement(By.xpath("//span[contains(text(),'Log out')]" ));
        logOut.click();

        System.out.println("Successfully logged out");

        driver.quit();


    }

}
