package org.testing.testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.base.Base;
import org.testng.annotations.Test;

public class TC8 extends Base {
	
	@Test
    public void flyingbeast() throws InterruptedException
    {
   
    	WebElement signin=driver.findElement(By.xpath(pr.getProperty("signin")));
    	signin.click();
    	
    	 Thread.sleep(2000);
    	
    	 WebElement username=driver.findElement(By.xpath(pr.getProperty("username")));
    	
    	 username.sendKeys("condecosingh@gmail.com");
    	
    	 WebElement next=driver.findElement(By.xpath(pr.getProperty("nextbuttonuser")));
    	next.click();
    	Thread.sleep(3000);
    	WebElement password=driver.findElement(By.xpath(pr.getProperty("password")));
    	password.sendKeys("Apple@123");
    	Thread.sleep(2000);
    	WebElement next2=driver.findElement(By.xpath(pr.getProperty("nextbuttonuser")));
    	next2.click();
    	Thread.sleep(3000);
    	
    	WebElement search=driver.findElement(By.xpath(pr.getProperty("search")));
    	search.sendKeys("Selenium");
    	Thread.sleep(2000);
    	
    	Actions act= new Actions(driver);
    	act.sendKeys(Keys.ARROW_DOWN).perform();
    	
    	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='gstl_50 sbdd_c']")));
    	
    	List<WebElement> all=driver.findElements(By.xpath("//ul[@role='listbox']"));
    	
    	for(WebElement e: all)
    	{
    		
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        	Thread.sleep(5000);
        	
    		String aa = e.getText();
    		if(aa.equals("selenium webdriver tutorial"))
    		{
    			act.sendKeys(Keys.ENTER).perform();
    		}
    	}
    	
    	
    	
    	
    	/*WebElement search=driver.findElement(By.xpath(pr.getProperty("search")));
    	search.sendKeys("Selenium");
    	
    	Actions act= new Actions(driver);
    	act.sendKeys(Keys.ARROW_DOWN).perform();
    	List<WebElement> all=driver.findElements(By.xpath("//ul[@role='listbox']"));
    	System.out.println(all.size());
    	for(WebElement e:all)
    	{
    		all.get(1).click();
    		break;
    		
    	}
*/
}
}

