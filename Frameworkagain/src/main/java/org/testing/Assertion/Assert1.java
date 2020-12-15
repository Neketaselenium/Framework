package org.testing.Assertion;

public class Assert1 {
	public static boolean assert1(String actual_url,String expected_url)
	{
		if(actual_url.equals(expected_url))
		{
		System.out.println("Reuslt is pass");
		return true;
		}
		else
		{
			System.out.println("resukt is fail");
			return false;
		}
		

	}

}
