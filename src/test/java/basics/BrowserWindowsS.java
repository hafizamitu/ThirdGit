package basics;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.WindowType;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class BrowserWindowsS {

	       public static void main(String[] args) {
	        
	            //System.setProperty("webdriver.chrome.driver", "C:\\NewChromeDriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe\\");
	            
	            WebDriver driver= new ChromeDriver(); 
	            
	            driver.get("https://demoqa.com/browser-windows");
	            
	            driver.manage().window().maximize();
	            
	            //To Scroll down for 5000 pixels
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            
	            js.executeScript("window.scrollBy(0,500)");
	            
	            driver.findElement(By.id("windowButton")).click();
	            
	            Set<String> parent = driver.getWindowHandles();
	            
	            System.out.println("Total number of windows: "+ parent.size());
	            
	            List<String> list = new ArrayList<>(parent);
	            
	            driver.switchTo().window(list.get(1));
	            
	            WebElement ele = driver.findElement(By.id("sampleHeading"));
	            
	            System.out.println("Text Message: "+ ele.getText());
	            
	            driver.switchTo().window(list.get(0));
	            
	            System.out.println("Title: "+ driver.getTitle());
	            
	            driver.findElement(By.id("tabButton")).click();
	            
	            //Switch to new Tab
	            //String windowHandle = driver.getWindowHandle();
	            
	            driver.switchTo().newWindow(WindowType.TAB);
	            
	            
	            
	            
	        
	    }
	    
	}	


