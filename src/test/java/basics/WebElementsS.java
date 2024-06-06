
package basics;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class WebElementsS {

    @Test
    public void setup() {
        
       WebDriver driver = new ChromeDriver();
       
       driver.get("https://www.mycontactform.com");
       
       driver.manage().window().maximize();
       
       driver.findElement(By.linkText("Sample Forms")).click();
       
       driver.findElement(By.id("subject")).sendKeys("Apartment");
       
       driver.findElement(By.id("email")).sendKeys("mitu@gmail.com");
       
       driver.findElement(By.id("q1")).sendKeys("lost the key");
       
       driver.findElement(By.id("q2")).sendKeys("could not open the door\n"+"need to call an Authority");
       
       WebElement dropdown= driver.findElement(By.id("q3"));
       
       driver.findElement(By.xpath("//input[@name='email_to[]' and @value='1']")).click();
       
       driver.findElement(By.xpath("//input[@value='First Option']")).click();
       
       driver.findElement(By.id("q5")).click();
       
       driver.findElement(By.xpath("//input[@value='First Check Box']")).click();
       
       Select s= new Select(dropdown);
       
       s.selectByVisibleText("Third Option");
       
       Select s1= new Select(driver.findElement(By.id("q8")));
       
       s1.selectByVisibleText("OR");
       
       Select s2= new Select(driver.findElement(By.id("q9")));
       
       s2.selectByVisibleText("United States of America");
       
       Select s3= new Select(driver.findElement(By.id("q10")));
       
       s3.selectByVisibleText("Ontario");
       
       Select s4= new Select(driver.findElement(By.name("q11_title")));
       
       s4.selectByVisibleText("Mrs.");
       
       driver.findElement(By.name("q11_first")).sendKeys("Hafiza Alam");
       
       driver.findElement(By.name("q11_last")).sendKeys("Mitu");
       
       Select s5= new Select(driver.findElement(By.name("q12_month")));
       
       s5.selectByIndex(2);
       
       Select s6= new Select(driver.findElement(By.name("q12_day")));
       
       s6.selectByIndex(3);
       
       Select s7= new Select(driver.findElement(By.name("q12_year")));
       
       s7.selectByValue("2002");
       
       //Date Selector(Calender)
       driver.findElement(By.id("q7")).click();
       
       Select s8 = new Select(driver.findElement(By.className("ui-datepicker-month")));
       
       s8.selectByVisibleText("Feb");
       
       Select s9 = new Select(driver.findElement(By.className("ui-datepicker-year")));
       
       s9.selectByVisibleText("2024");
       
       String date = "12";
       
       List<WebElement> allDates = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//tbody"));
       
       for(WebElement ele : allDates) {
           
           String dt = ele.getText();
           
           if(dt.equals(date)) {   
               
           }
       
           ele.click();
           break;
       }

        
    }
}