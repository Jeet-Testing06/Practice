package practice_qs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prateek2 {
	
	public static void main(String[] args) {
		
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\jitender.ahuja\\Downloads\\Jar Files\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	WebElement email= driver.findElement(By.id("email"));
	email.sendKeys("prateekbajaj1990");
	
	WebElement pass= driver.findElement(By.id("pass"));
	pass.sendKeys("7JrG0147");
	
	WebElement login= driver.findElement(By.xpath("//input[@aria-label='Log In']"));
	login.click();
			
}
}