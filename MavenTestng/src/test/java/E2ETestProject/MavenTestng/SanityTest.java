package E2ETestProject.MavenTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class SanityTest {

	public WebDriver driver;
	String ChromeDriverPath=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	
	 
	@Test
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}
}
