package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerWithFirefox {

	public static void main(String[] args)  throws MalformedURLException {
		
		RemoteWebDriver driver = new RemoteWebDriver(
				 new URL("http://localhost:4444/wd/hub"),
				 new FirefoxOptions());
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Title of the page:"+ driver.getTitle());
		driver.quit();

	}

}
