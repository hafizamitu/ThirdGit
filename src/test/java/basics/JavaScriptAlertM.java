package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertM {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
        //xpath formula: //tagname[@attribute='value']
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        
        //alert interface reference
        Alert alert =  driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept(); // click on ok
        
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        alert.dismiss(); // click on cancel
        
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        alert.sendKeys("Anything");
        alert.accept();
        
        
    }

}