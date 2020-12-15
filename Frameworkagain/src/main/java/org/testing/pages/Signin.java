package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signin {
	ChromeDriver driver;
	Properties pr;
	
	//By aa = By.xpath(pr.getProperty("signin"));

	public Signin(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	 public void login(String username, String Password) throws InterruptedException
	 {
		    WebElement signin=driver.findElement(By.xpath(pr.getProperty("signin")));
	    	signin.click();
	    	Thread.sleep(2000);
	    	WebElement username1=driver.findElement(By.xpath(pr.getProperty("username")));
	    	username1.sendKeys(username);
	    	WebElement next=driver.findElement(By.xpath(pr.getProperty("nextbuttonuser")));
	    	next.click();
	    	Thread.sleep(3000);
	    	WebElement password=driver.findElement(By.xpath(pr.getProperty("password")));
	    	password.sendKeys(Password);
	    	Thread.sleep(2000);
	    	WebElement next2=driver.findElement(By.xpath(pr.getProperty("nextbuttonuser")));
	    	next2.click();
	    	
	    	
	 }

}
