package Vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class VyTrackAssingnment {

    WebDriver driver;

    String loginPageUrl = "https://qa2.vytrack.com/user/login";


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //maximizing browser
        driver.manage().window().maximize();
        //adding implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void Login() throws InterruptedException {

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
        Assert.assertEquals(driver.getTitle(), "Dashboard");
        WebElement forFleet = driver.findElement(By.xpath("(//i[@class='fa-asterisk menu-icon'])[1]/.."));
        forFleet.click();
        WebElement odometer = driver.findElement(By.xpath("//span[.='Vehicle Odometer']"));
        odometer.click();
        Thread.sleep(1234);
        Assert.assertTrue(driver.getTitle().contains("Odometer"));
        //verify the user is on the grid information page


        Thread.sleep(2000);
        //verify user can click on create vehicle odometer button
        driver.findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']")).click();

        //verify user can enter information on the create vehicle odometer page
        driver.findElement(By.xpath("//input[@name='custom_entity_type[OdometerValue]']")).sendKeys("15000");

        //verify user can click on cancel button
        driver.findElement(By.partialLinkText("Cancel")).click();



    }
}

       // @Test

           /* WebElement odometer = driver.findElement(By.xpath("//span[.='Vehicle Odometer']"));

            //
            List<WebElement> tableValues = driver.findElements(By.xpath("//table[@class='grid table-hover table table-bordered table-condensed']"));
            System.out.println(tableValues.size());
        }

            */







