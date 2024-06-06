package basics;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLinkAndScreenShotM {

	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mycontactform.com");
        driver.manage().window().maximize();

        // Transfer to another page
        driver.findElement(By.linkText("Sample Forms")).click();

       // int linkClickCount = 0; 
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 11; j++) {
                List<WebElement> xpaths = driver.findElements(By.xpath("//div[@id='left_col_top']/ul[" + i + "]/li[" + j + "]/a"));
                // Check if the element exists before trying to access it
                if (!xpaths.isEmpty()) {
                    WebElement xpath = xpaths.get(0); // Assuming only one element in the list
                    xpath.click();
                   // System.out.println("Navigated to: " + driver.getCurrentUrl());
                    //linkClickCount++; 
                    //System.out.println("links clicked: " + linkClickCount);

                    // Take the screenshot
                    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

                    // Save screenshot
                    try {
                        FileUtils.copyFile(screenshot, new File("C:\\Users\\wayes\\eclipse-workspace\\seleniumdemos\\Screenshot\\photo"+i+" "+j+".jpg"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                
                }
            }
        
        // Close the browser
        driver.quit();
    }
}