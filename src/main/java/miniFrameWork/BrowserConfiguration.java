
package miniFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserConfiguration {

    //To Do: Add Browser Configuration
    
    public static WebDriver browserConfiguration() {
        
        //System.setProperty("webdriver.chrome.driver", "C:\\NewChromeDriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe\\");
        
        ChromeOptions options = new ChromeOptions();
        
        options.addArguments("--disable-notifications"); //To disable notifications
        
        options.addArguments("--start-maximized");
        
        WebDriver driver = new ChromeDriver(options);
        
        driver.manage().window().maximize();
        
        return driver;
        
    }
    
}