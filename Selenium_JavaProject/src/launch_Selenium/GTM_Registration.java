package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GTM_Registration 
{
	public static void main(String[] args) throws InterruptedException 
	{

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("gowri@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Gowri@123");
		driver.findElement(By.id("Present-Address")).sendKeys("Vivekandha 1st St");
		driver.findElement(By.id("Permanent-Address")).sendKeys("Vivekandha 1st St");
		driver.findElement(By.id("Pincode")).sendKeys("600007");
		Thread.sleep(1000);
		driver.quit();
	}

}
