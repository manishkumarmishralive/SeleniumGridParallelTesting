package gridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		
		//1. Define Desired Capabilities:
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setBrowserName("Chrome");
		cap.setPlatform(Platform.WIN10);
		
		//2.Chrome options Definitions:
		ChromeOptions options= new ChromeOptions();
		options.merge(cap);
		
		String hubURL="http://192.168.43.148:4444/wd/hub";
		RemoteWebDriver driver=new RemoteWebDriver(new URL(hubURL), options);
		
		driver.get("https://spicejet.com");
		System.out.println(driver.getTitle());
		

	}

}
