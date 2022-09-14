package testscripts;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Config.common;



public class clogin extends common {
	
	
	@Test
	public void testLogin() throws Exception
	{
		d.get("https://demo.cyclos.org/ui/home");
		ObjectRepository loginpage=new ObjectRepository(d);
		loginpage.filllogin("demo", "1234");
		Thread.sleep(2000);
		loginpage.lnkLogout.click();
		Thread.sleep(2000);
		
	}
	
}