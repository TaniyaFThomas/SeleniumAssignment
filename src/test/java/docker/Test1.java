package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Test1 {
		
		@Test
		public void test1() throws MalformedURLException {
			RemoteWebDriver driver = new RemoteWebDriver(
					 new URL("http://localhost:4444/wd/hub"),
					 new ChromeOptions().addArguments("--no-sandbox",
						 "start-maximized",
						 "disable-infobars",
						 "--disable-extensions",
						 "--disable-dev-shm-usage"));
			
			driver.get("https://www.gmail.com/");
			System.out.println("Title of gmail:"+ driver.getTitle());
			Assert.assertEquals("Gmail", driver.getTitle(), "Incorrect title in gmail page");
			driver.quit();
			
		}
}
