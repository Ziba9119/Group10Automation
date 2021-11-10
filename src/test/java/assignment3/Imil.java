package assignment3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imil {
        /*
            Scenario:Verify users can access to forgot password page  -- Imil
            Given I am on the the url "https://login2.nextbasecrm.com"
            And I can see forgot password button
            When I click on it
            Then I should get "Get Password"
            And I should see "Reset password"
     */

        public static void main(String[] args) {

            //Given I am on the the url "https://login2.nextbasecrm.com"
            String appUrl = "https://login2.nextbasecrm.com";
            //WebDriver driver = WebDriverFactory.getDriver("chrome");
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(appUrl);

            System.out.println("Url is valid");

            //And I can see forgot password button
            WebElement forgotPasswordButton = driver.findElement(By.cssSelector("a[class='login-link-forgot-pass']"));
            if(forgotPasswordButton.isDisplayed()) {
                System.out.println("PASS: Forgot Password Button is valid");
            }else{
                System.out.println("FAIL: Forgot Password Button is not viewable");
            }

            //When I click on it
            forgotPasswordButton.click();

            //Then I should see "Get Password"
            WebElement getPasswordText = driver.findElement(By.xpath("//div[.='Get Password']"));
            if(getPasswordText.isDisplayed()){
                System.out.println("Pass: Get Password text is displayed");
            }else{
                System.out.println("Fail: Get Password text is not displayed");
            }

            //And I should see "Reset password"
            WebElement resetPasswordButton = driver.findElement(By.xpath("//button[@value='Reset password']"));
            if(resetPasswordButton.isDisplayed()){
                System.out.println("Pass: Reset password button is displayed");
            }else{
                System.out.println("Fail: Reset password button is not displayed");
            }
            driver.quit();

        }
    }


