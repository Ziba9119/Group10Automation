package murodil_assingnments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorAutomation{

    static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        String appUrl = "https://www.calculator.net";
        driver.get(appUrl);

        System.out.println(testOperator(8, 5, '–') ? "Passed" : "Failed");

        driver.quit();


    }

    public static boolean testOperator(int num1, int num2, char operator){

        int expected = BaseClass.calculate(num1, num2, operator);

        WebElement five = driver.findElement(By.xpath("//span[@onclick='r(" + num1 + ")']"));

        WebElement three = driver.findElement(By.cssSelector("span[onclick='r(" + num2 + ")']"));

        WebElement plus = driver.findElement(By.xpath("//*[.='"+ operator + "']"));

        WebElement equals = driver.findElement(By.xpath("//span[text()='=']"));

        five.click();
        plus.click();
        three.click();
        equals.click();

        WebElement result = driver.findElement(By.xpath("//div[@id='sciOutPut']"));

        String resultText = result.getText().trim();

        if(expected == Integer.parseInt(resultText)){
            return true;
        }else{
            return false;
        }
    }



}
