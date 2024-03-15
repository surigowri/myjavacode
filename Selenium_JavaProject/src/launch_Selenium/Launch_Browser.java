package launch_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser
{

	public static void main(String[] args)
	{

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
