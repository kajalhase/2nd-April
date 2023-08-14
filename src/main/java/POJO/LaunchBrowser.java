package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static WebDriver main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91982\\Music\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
			driver.get("");
			return driver;

	}

}
