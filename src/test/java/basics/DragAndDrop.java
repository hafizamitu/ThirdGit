package basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class DragAndDrop {
	public static void main(String[] args) {
        //ChromeOptions options=new ChromeOptions();
        //options.addArguments("start-maximized");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.jqueryui.com");
        //to maximize the browser
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Droppable")).click();
        WebElement frm=driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frm);
        //for drag and drop
        WebElement src=driver.findElement(By.id("draggable"));
        WebElement dest=driver.findElement(By.id("droppable"));
        
        Actions a=new Actions(driver);
        a.clickAndHold(src)
        .moveToElement(dest)
        .release(dest)
        .build()
        .perform();

    }
}


