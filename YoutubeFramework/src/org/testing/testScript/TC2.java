package org.testing.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Assertions.Assertions1;
import org.testing.base.Base;
import org.testing.pages.Signin;
import org.testing.utilities.LogCature;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import junit.framework.Assert;

public class TC2 extends Base{
	
	
    
    @Test
    public void subscription() throws InterruptedException
    {
    	Signin obj= new Signin(driver,pr);
    	obj.login("condecosingh@gmail.com", "Apple@123");
    	Thread.sleep(2000);
    	String expected_url="http://www.youtube.com";
    	String actual_url="http://www.youtube.com";
    	//LogCature.capturelogs("TC2", "Sign in successfully");
    	WebElement subscriptions=driver.findElement(By.xpath(pr.getProperty("subscription")));
    	subscriptions.click();
    	LogCature.capturelogs("TC2", "Click on Subscription Successfully");
    	Assert.assertTrue(Assertions1.assert1(actual_url, expected_url));
    }
  
    
    

}
