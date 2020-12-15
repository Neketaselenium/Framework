package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {
	
	
	public static void selectbyvisibletext(WebElement e,String visibletext)
	{
		Select s= new Select(e);
		s.selectByVisibleText(visibletext);
		
	}
	public static void selectbyvalue(WebElement e,String value)
	{
		Select s= new Select(e);
		s.selectByValue(value);
		
	}
	public static void selectbyindex(WebElement e,int index)
	{
		Select s= new Select(e);
		s.selectByIndex(index);
		
	}

}
