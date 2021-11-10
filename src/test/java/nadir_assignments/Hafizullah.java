package nadir_assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Hafizullah {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://te.dev.secureci.com/Exercise1.html");
        List<WebElement> links = driver.findElements(By.tagName("area"));

        for (int i = 0; i < links.size(); i++) {
            //http://te.dev.secureci.com/MapLink.html?p=0
            if(!links.get(i).getAttribute("href").equals("http://te.dev.secureci.com/MapLink.html?p=" + i)){
                System.out.println("Broken link index: " + i);
                break;
            }

        }

        links.get(1675).click();

        driver.quit();


    }
}
