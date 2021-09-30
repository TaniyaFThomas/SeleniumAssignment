package docker;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Container_Setup {
	
	@BeforeTest
	void startDockerGrid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start start_container.bat");
		Thread.sleep(120000);
	}
	
	@AfterTest
	void stopDockerGrid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start stop_container.bat");
		Thread.sleep(60000);
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe"); //closes cmd
	}


}
