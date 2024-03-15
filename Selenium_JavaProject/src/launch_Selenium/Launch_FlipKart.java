package launch_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_FlipKart
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String[] titleWords = title.split(" ");
		for (int i = 0; i < titleWords.length; i++) {
		    String word = titleWords[i];
		    System.out.println(word);
		}
		driver.close();
		
	}

	}

