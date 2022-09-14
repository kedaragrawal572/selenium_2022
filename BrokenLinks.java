package testscripts;

import static org.testng.Assert.assertEquals;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Config.common;

public class BrokenLinks extends common1  {
	
	
	@Test
	public void testLinks() throws Exception
	{
		// Load web page
		
		d.get("https://www.selenium.dev/documentation/");
		// Verify page title
		assertEquals(d.getTitle(),"The Selenium Browser Automation Project | Selenium");
		List<WebElement> l=d.findElements(By.className("nav-link"));
		System.out.println("No of links:"+l.size());
		for(WebElement e:l)
		{
			try
			{
				
				if(e.getAttribute("href")!=null)
				{
					URL u=new URL(e.getAttribute("href"));
					//e.click();
					HttpURLConnection con=(HttpURLConnection)u.openConnection();
					con.setConnectTimeout(60000);
					con.connect();
					//System.out.println("Response code:"+u+"--->"+con.getResponseCode() );
					if(con.getResponseCode() == 200)
					{
						System.out.println("Link:"+u+"---> is working fine");
					}
					else
					{
						System.out.println("Link:"+u+"---> is not working");
						
					}
				}
				
			}
			catch(Exception ie)
			{
				System.out.println(ie);
			}
			
		}
		
	}
	

}

	

