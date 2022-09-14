package testscripts;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
//kedar agrawal
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class bharti {
	
	WebDriver d;
	@BeforeMethod
	public void method1()
	{
		d=new ChromeDriver();
		d.manage().window().maximize();
		//d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//d.manage().timeouts().pageLoadTimeout(3,TimeUnit.MINUTES);
		
	}
	@AfterMethod
	public void method2()
	{
		d.quit();
	}
	
	@Test
	public void method3() throws Exception
	{
		d.get("https://www.chase.com/");
		d.findElement(By.linkText("Credit Cards")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("Explore credit cards")).click();
		Thread.sleep(2000);
		System.out.println("the size of a tag="+d.findElements(By.tagName("a")).size());
		d.findElement(By.linkText("All Cards ")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("View all Rewards Cards")).click();
		Thread.sleep(3000);
	
	}
	
}
