package miniFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public WebDriver driver;
	public Login (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//for login page
	@FindBy(id="user")
	private WebElement username;
	//@FindBy(className="btn_log")
	//private WebElement clickOnLogin;
	public void setUsername(String user) {
		username.sendKeys(user);
	}
	public void setPassword(String pass, WebElement password) {
		password.sendKeys(pass);
	}

}
