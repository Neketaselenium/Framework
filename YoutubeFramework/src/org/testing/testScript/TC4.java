package org.testing.testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testing.base.Base;
import org.testing.pages.Signin;
import org.testing.pages.Signout;
import org.testing.utilities.CaptureScreenShot;
import org.testng.annotations.Test;

public class TC4 extends Base{
	

    
    @Test
    public void history() throws InterruptedException, IOException
    {
    	Signin obj= new Signin(driver,pr);
    	obj.login("condecosingh@gmail.com", "Apple@123");
    	Thread.sleep(3000);
    	WebElement history=driver.findElement(By.xpath(pr.getProperty("history")));
    	history.click();
    	WebElement imgclick=driver.findElement(By.xpath(pr.getProperty("imagclick")));
    	imgclick.click();
    	Thread.sleep(3000);
    	Signout sign= new Signout(driver,pr);
    	sign.logout();
    	
    	String path ="C://snapshot/first.png";
    	CaptureScreenShot.screenshot(driver, path);
    		
    }
    

}
