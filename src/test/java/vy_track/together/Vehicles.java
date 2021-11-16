package vy_track.together;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Vehicles {


    @Test
    public void testVehicle(WebDriver driver){

        WebElement vehicles = driver.findElement(By.xpath("//span[text() = 'Vehicles']"));
        vehicles.click();

        WebElement carsText = driver.findElement(By.xpath("//h1[text() = 'Cars']"));

        if(carsText.isDisplayed()){
            System.out.println(carsText.getText() + " is properly displayed");
        }else{
            System.out.println(carsText.getText() + " is failing");
        }

        System.out.println();

        List<WebElement> carsInfo = driver.findElements(By.xpath("//tr[@class='grid-row row-click-action']"));

        if(carsInfo.size() > 0){
            System.out.println("Truck driver can see cars information");
        }else{
            System.out.println("Truck driver can not see cars information - FAIL");
        }

        WebElement firstCar = driver.findElement(By.xpath("(//tr[@class='grid-row row-click-action'])[1]"));
        firstCar.click();


    }


}
