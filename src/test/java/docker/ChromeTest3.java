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
				 new ChromeOptions());
		
		driver.get("https://www.flipkart.com/");
		System.out.println("Title of the page:"+ driver.getTitle());
		driver.quit();
		
	}

}
