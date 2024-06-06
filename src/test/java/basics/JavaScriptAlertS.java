package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertS {
	

public static void main(String[] args) {
    
    WebDriver driver= new ChromeDriver(); 
    
    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    
    driver.manage().window().maximize();
    
    driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
    
    //Alert interface reference
    Alert alert = driver.switchTo().alert();
    
    System.out.println(alert.getText());
    
    alert.accept(); //Click On OK
    
    driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
    
    System.out.println(alert.getText());
    
    alert.dismiss(); //Click on Cancel
    
    driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
    
    alert.sendKeys("Okkk!!");
    
    System.out.println(alert.getText());
    
    alert.accept(); //Click on OK
    
}
}