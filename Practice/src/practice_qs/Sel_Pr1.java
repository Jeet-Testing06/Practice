package practice_qs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sel_Pr1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitender.ahuja\\Downloads\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		WebElement login = driver.findElement(By.id("u_0_2"));
		Actions a = new Actions(driver);
		
		a.keyDown(Keys.CONTROL).click(login).keyUp(Keys.CONTROL).perform();
		
		String ori = driver.getWindowHandle();
		
		
		java.util.Set <String> all = driver.getWindowHandles();
		
		for (String jeet: all)
		{
			driver.switchTo().window(jeet);
		}
		
		
		driver.switchTo().window(ori);
		
	}

}
