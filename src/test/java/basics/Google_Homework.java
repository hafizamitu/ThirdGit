
package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Google_Homework {

    public static void main(String[] args) throws InterruptedException {
        
//      ChromeOptions options= new ChromeOptions();
       
//        options.addArguments("start-maximized");
        
        WebDriver driver= new ChromeDriver(); 
        
        driver.get("https://www.google.com");
        
        driver.manage().window().maximize();
        
        WebElement appsIcon = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
        
        Actions a= new Actions(driver);
        
        a.moveToElement(appsIcon).perform();
        
        System.out.println("Google Apps Icon Text: "+ appsIcon.getAttribute("aria-label"));
        
        
    }

    
    }