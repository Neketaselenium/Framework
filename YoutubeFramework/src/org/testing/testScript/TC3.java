package org.testing.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.Base;
import org.testing.pages.Signin;
import org.testng.annotations.Test;

public class TC3 extends Base{
	
	
    
    @Test
    public void library() throws InterruptedException
    {
    	Signin obj= new Signin(driver,pr);
    	obj.login("condecosingh@gmail.com", "Apple@123");
    	Thread.sleep(3000);
    	WebElement library=driver.findElement(By.xpath(pr.getProperty("library")));
    	library.click();
    	
    }
   

}
