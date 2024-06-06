package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import miniFrameWork.BrowserConfiguration;

public class Setup {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver=BrowserConfiguration.browserConfiguration();
		driver.get("https:/www.mycontactform.com");
	}
	@AfterMethod
	public void teardown()throws InterruptedException{
		System.out.println("Closing browser");
		Thread.sleep(4000);
		driver.quit();
	}

}
