package vy_track;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class US1_AC3_EventPlanner_Nicole {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String url = "https://qa2.vytrack.com/user/login";
        driver.manage().window().maximize();

        driver.get(url);

        WebElement username = driver.findElement(By.xpath("//input[@name = '_username']"));
        username.sendKeys("user27");

        Thread.sleep(1234);

        WebElement password = driver.findElement(By.cssSelector("input[name = '_password']"));
        password.sendKeys("UserUser123");

        Thread.sleep(1234);

        WebElement loginButton = driver.findElement(By.xpath("//button[. = 'Log in']"));

        loginButton.click();

        Thread.sleep(1234);

        WebElement fleetModule = driver.findElement(By.xpath("//span[contains(@class,'title')]"));
        fleetModule.click();

        Thread.sleep(1234);

        WebElement vehicles = driver.findElement(By.xpath("//span[.='Vehicles']"));
        vehicles.click();


        String actUrl  = "https://qa2.vytrack.com/entity/Extend_Entity_Carreservation";
        String expUrl = "https://qa2.vytrack.com/entity/Extend_Entity_Carreservation";

        if(expUrl.contains(actUrl)){
            System.out.println("PASS: Can be able to see all Vehicles information");
        }else{
            System.out.println("FAIL: Vehicle information can't seen");
        }



    }
}


