package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxTest1 {
	@Test
	public void test4() throws MalformedURLException {
		RemoteWebDriver driver = new RemoteWebDriver(
				 new URL("http://localhost:4444/wd/hub"),
				 new FirefoxOptions());
		
		driver.get("https://www.yahoo.com/");
		System.out.println("Title of the page:"+ driver.getTitle());
		driver.quit();
		
	}

}
