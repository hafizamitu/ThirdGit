package basics;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class LinkAndBoxCount {
	public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.mycontactform.com");
        //to maximize the browser
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Sample Forms")).click();
        //find how many links in this page
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total number of links in the page are "+links.size());
        //find how many text boxes in this page
        List<WebElement> textboxes=driver.findElements(By.tagName("//input[@type='text']"));
        System.out.println("Total number of text boxes in the page are "+textboxes.size());
    }
}

