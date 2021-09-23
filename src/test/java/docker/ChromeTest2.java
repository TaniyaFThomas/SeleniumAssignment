package docker;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest2 {
	@Test
	public void test2() throws MalformedURLException {
		RemoteWebDriver driver = new RemoteWebDriver(
				 new URL("http://localhost:4444/wd/hub"),
				 new ChromeOptions().addArguments("--no-sandbox",
						 "start-maximized",
						 "disable-infobars",
						 "--disable-extensions",
						 "--disable-dev-shm-usage"));
		
		driver.get("https://www.google.com/");
		System.out.println("Title of google:"+ driver.getTitle());
		//driver.get("https://github.com/login");
		//System.out.println("Title of the page:"+ driver.getTitle());
		//driver.findElement(By.id("login_field")).sendKeys("taniya@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("Tan");
		//driver.findElement(By.name("commit")).click();
		//System.out.println("Title of the page:"+ driver.getTitle());
		driver.quit();
		
	}

}
