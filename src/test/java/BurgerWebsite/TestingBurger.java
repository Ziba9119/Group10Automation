package BurgerWebsite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingBurger {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Scenario: home page should open and user should see home page
        String url = "https://burgerim.com/";
        //Step1: Go to "https://burgerim.com/"
        goToUrl(url, driver);
        System.out.println("URL open");
        //Step2: Click on home button
        clickOnLink("HOME", driver);
        System.out.println("HOME button clicked");
        //Step3: Current url should be "https://burgerim.com/"
        String expectedUrl = "https://burgerim.com/";
        if(checkUrl(expectedUrl, driver)){
            System.out.println("Pass: URL's are matching and scenario is completed");
        }else{
            System.out.println("Fail: URL's are not matching");
        }



    }

    public static void goToUrl(String url, WebDriver driver){
        driver.get(url);
    }

    public static void clickOnLink(String linkName, WebDriver driver) throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(By.linkText(linkName)).click();
    }

    public static boolean checkUrl(String expected, WebDriver driver){
        String actualUrl = driver.getCurrentUrl();
        return expected.equals(actualUrl);
    }

}
