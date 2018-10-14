package practice_qs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Prateek {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitender.ahuja\\Downloads\\Jar Files\\chromedriver_win32\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	
	
	
	
	

}
}