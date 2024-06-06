
package miniFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{ //Page Object Model

    //ToDo: Add page Factory
    //Why we use page FActory--> re-usability of code
    
    public WebDriver driver;
    
    public LoginPage(WebDriver driver) {
        
        this.driver = driver;
        
        PageFactory.initElements(driver,this); //initElements is used to initialize all the elements.
        
    }

    @FindBy(id="user")
    private WebElement username; //WebElement userName = driver.findElement(By.id("user"));
    
    @FindBy(id="pass")
    private WebElement password; //WebElement passWord = driver.findElement(By.id("pass"));
    
    public void setUsername(String user) {
        
        username.sendKeys(user);
    }
    
    public void setPassword(String pass) {
        
        password.sendKeys(pass);
    }
    
}