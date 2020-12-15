package org.testing.testScript;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.base.Base;
import org.testing.pages.Signin;
import org.testing.pages.Videoplay;
import org.testng.annotations.Test;

public class TC7 extends Base{
	
	
    @Test
    public void history() throws InterruptedException
    {
    	Signin obj= new Signin(driver,pr);
    	obj.login("condecosingh@gmail.com", "Apple@123");
    	Thread.sleep(2000);
    	Videoplay obj1= new Videoplay(driver,pr);
    	obj1.vedioplayyoutube();
    	Thread.sleep(2000);
    	
    	Actions act= new Actions(driver);
    	act.sendKeys(Keys.PAGE_DOWN).perform();
    	Thread.sleep(3000);
        WebElement imagclick= driver.findElement(By.xpath(pr.getProperty("commentimage")));
        imagclick.click();  
        Thread.sleep(2000);
        act.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        WebElement comment=driver.findElement(By.xpath(pr.getProperty("commentclick")));
        comment.sendKeys("nice");
        act.sendKeys("nice");
        Thread.sleep(2000);
    	WebElement commentbutton=driver.findElement(By.xpath(pr.getProperty("commentbutton")));
    	commentbutton.click();	
   }
   
}
