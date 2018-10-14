package practice_qs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sel_Pr {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitender.ahuja\\Downloads\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement first = driver.findElement(By.name("firstname"));
		first.sendKeys("Prateek");
		
		WebElement last = driver.findElement(By.name("lastname"));
		last.sendKeys("Bajaj");
		
		WebElement mobile = driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("9654364636");
		
		WebElement pwd = driver.findElement(By.name("reg_passwd__"));
		pwd.sendKeys("abcdef");
		
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByIndex(6);
		
		WebElement month = driver.findElement(By.id("month"));
		month.click();
		Actions a = new Actions(driver);
		
		for (int i=0; i<1; i++)
		{
			
			a.sendKeys(Keys.UP).perform();
			
		}
		
		a.click().perform();
		
		WebElement year = driver.findElement(By.id("year"));
		year.click();
		Actions a1 = new Actions(driver);
		
		for (int i=0; i<3; i++)
		{
			
			a1.sendKeys(Keys.DOWN).perform();
			
		}
		
		a1.click().perform();
		
		
		WebElement gender = driver.findElement(By.id("u_0_a"));
		gender.click();
		
		
		
		WebElement sign = driver.findElement(By.name("websubmit"));
		sign.click();
		
		
		
		
		
		
	}

}
