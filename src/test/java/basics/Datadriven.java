package basics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import miniFrameWork.Login;

public class Datadriven {
	//public WebDriver driver;
	String[][]data;
	@DataProvider(name="data")
	public String[][]Datadriven()throws IOException{
		return data=ExcelReader.testdata();
	}
	@Test(dataProvider="data")
	public void test(String User,String Pass, String pass, String user, WebDriver driver) {
		Login l=new Login(driver);
		l.setUsername(user);
		l.setPassword(pass);
		//l.clickLogin();
	}

}
