package basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchTheBrowser {
	static{
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver c=new ChromeDriver();
		FirefoxDriver f=new FirefoxDriver();

	}

}
