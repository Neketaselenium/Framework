package org.testing.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Videoplay {
	
	ChromeDriver driver;
	Properties pr;
	
	public Videoplay(ChromeDriver driver,Properties pr)
	{
	
		this.driver= driver;
		this.pr=pr;
	}
	
	public void vedioplayyoutube() throws InterruptedException
	{
		List<WebElement> all=driver.findElements(By.id(pr.getProperty("videocollection")));
    	System.out.println(all.size());
    	Thread.sleep(5000);
    	for(WebElement e:all)
    	{
    		
    		all.get(0).click();
    		break;
    	}
	}

}
