package org.testing.testScript;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testing.base.Base;
import org.testing.pages.Signin;
import org.testing.pages.Videoplay;
import org.testng.annotations.Test;

public class TC5 extends Base {

	
    
    @Test
    public void history() throws InterruptedException
    {
    	Signin obj= new Signin(driver,pr);
    	obj.login("condecosingh@gmail.com", "Apple@123");
    	Thread.sleep(2000);
    	Videoplay obj1= new Videoplay(driver,pr);
    	obj1.vedioplayyoutube();
    	Thread.sleep(2000);
    	WebElement like=driver.findElement(By.xpath(pr.getProperty("like")));
    	like.click();
   }
   
}
