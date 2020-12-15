package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signout {
	ChromeDriver driver;
	Properties pr;
	
	public Signout(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}

	public void logout() throws InterruptedException
	{
		WebElement signout=driver.findElement(By.xpath(pr.getProperty("signout")));
		Thread.sleep(3000);
		signout.click();
		
	}
}
