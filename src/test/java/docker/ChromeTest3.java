package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest3 {
	@Test
	public void test3() throws MalformedURLException {
		RemoteWebDriver driver = new RemoteWebDriver(
				 new URL("http://localhost:4444/wd/hub"),
				 new ChromeOptions().addArguments("--no-sandbox",
						 "start-maximized",
						 "disable-infobars",
						 "--disable-extensions",
						 "--disable-dev-shm-usage"));
		
		driver.get("https://www.flipkart.com/");
		System.out.println("Title of flipkart:"+ driver.getTitle());
		assertEquals("Amazon", driver.getTitle(), "Title of flipkart page incorrect");
		driver.quit();
		
	}

}
