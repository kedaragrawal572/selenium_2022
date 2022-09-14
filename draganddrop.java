package testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class draganddrop {

	 WebDriver d;
		@Test
	  public void method1() throws Exception
	  {
		  //load the web page
			d.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=EAIaIQobChMIpoGdquub-QIVBzdgCh0IRwy-EAAYASAAEgLipfD_BwE");
			//verify the pages
			While(isElementPresent(d,By.xpath("//img[@src=\"https://assets.myntassets.com/w_122,c_limit,fl_progressive,dpr_2.0/assets/images/2022/2/25/bc7da1f5-7a05-40b0-83fb-8dac5cffcaa11645773416091-Sarees.jpg\"]")))
			{
				((RemoteWebDriver)d).executeScript("window.scrollBy(0,400)");
				Thread.sleep(3000);
			}
	  }
		
	@BeforeMethod
	public void method2()
  {
	  //launch the brower
	  System.setProperty("webdriver.gecko.driver","C:\\WebDriver\\bin\\geckodriver.exe");
	  d=new FirefoxDriver();
	  d.manage().window().maximize();  
	 // d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	 // d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
  }
  @AfterMethod
  public void method3()
  {
	 //close the browser
	  d.quit();
  }

}
