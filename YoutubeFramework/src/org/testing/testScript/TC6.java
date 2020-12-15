package org.testing.testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testing.base.Base;
import org.testing.pages.Signin;
import org.testing.pages.Videoplay;
import org.testng.annotations.Test;

public class TC6 extends Base {


	@Test
	public void history() throws InterruptedException
	{
		Signin obj= new Signin(driver,pr);
    	obj.login("condecosingh@gmail.com", "Apple@123");
		Thread.sleep(3000);
		List<WebElement> all=driver.findElements(By.id(pr.getProperty("videocollection")));
		System.out.println(all.size());
		Thread.sleep(5000);
		Videoplay obj1= new Videoplay(driver,pr);
    	obj1.vedioplayyoutube();
    	Thread.sleep(2000);
		WebElement aa =  driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-subscribe-button-renderer']"));
		String qq = aa.getText();
		if(qq.equals("Subscribe"))
		{
			aa.click();
		}
		else
		{
			System.out.println("Already subscribed");
		}
		
	}		

}



