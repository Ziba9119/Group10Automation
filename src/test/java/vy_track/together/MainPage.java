package vy_track.together;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class MainPage {

    @Test
    public void testMainPage(WebDriver driver) throws InterruptedException {

        WebElement launchpadText = driver.findElement(By.xpath("//h1[text() = 'Quick Launchpad']"));

        if(!launchpadText.isDisplayed()){
            System.out.println("Main page launchpad text verification failing");
        }else{
            System.out.println("Launchpad is displayed ");
        }

        List<WebElement> myModules = driver.findElements(By.xpath("//span[@class = 'title title-level-1']"));

        for (int i = 0; i < myModules.size(); i++) {
            if(myModules.get(i).isDisplayed()){
                System.out.println(myModules.get(i).getText() + " is properly displayed");
            }else{
                System.out.println(myModules.get(i).getText() + " verification failed");
            }
        }

        List<WebElement> fleetModules = driver.findElements(By.xpath("//div[@id='main-menu']/ul/li[1]/div/div/ul/li"));
        fleetModules.remove(0);
        fleetModules.remove(0);

        WebElement fleet = driver.findElement(By.xpath("(//span[@class = 'title title-level-1'])[1]"));
        fleet.click();

        System.out.println();

        for (int i = 0; i < fleetModules.size(); i++) {
            if(fleetModules.get(i).isDisplayed()){
                System.out.println(fleetModules.get(i).getText() + " is properly displayed");
            }else{
                System.out.println(fleetModules.get(i).getText() + " verification failed");
            }
        }

        Thread.sleep(4000);

        System.out.println();

    }



}
