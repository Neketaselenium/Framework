package org.testing.utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {
	
	public static void screenshot(ChromeDriver driver,String path) throws IOException
	{
		File f=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(path));
		
	}

}
