package org.testing.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public ChromeDriver driver;
	public Properties pr;

    @BeforeMethod
	public void browser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "..//YoutubeFramework//chromedriver.exe");
		driver= new ChromeDriver();
		pr= new Properties();
		File f= new File("..//YoutubeFramework//ObjectRepository.properties");
		FileInputStream fi= new FileInputStream(f);
		pr.load(fi);
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
	}
 @AfterMethod
    
    public void browserclose()
    {
    	//driver.close();
    }

}
