package org.testing.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.Base;
import org.testing.pages.Signin;

import org.testng.annotations.Test;

public class TC1 extends Base{
	
	 @Test
	    public void trending() throws InterruptedException
	    {
	    	Signin obj= new Signin(driver,pr);
	    	obj.login("condecosingh@gmail.com", "Apple@123");
	    	Thread.sleep(3000);
	    	WebElement img=driver.findElement(By.xpath(pr.getProperty("imagclick")));
	    	Thread.sleep(2000);
	    	WebElement email=driver.findElement(By.xpath(pr.getProperty("emailid")));
	    	String actual_email=email.getText();
	    	System.out.println(actual_email);
	    	String expected_email= "condecosingh@gmail.com";
	    	Thread.sleep(2000);
	    	//LogCature.capturelogs("TC1", "Login in Successfully");
	    	WebElement trending=driver.findElement(By.xpath(pr.getProperty("trending")));
	    	trending.click();
	    	//LogCature.capturelogs("TC1", "Click on Trending successfully");
	    	
	    }
	    

}
