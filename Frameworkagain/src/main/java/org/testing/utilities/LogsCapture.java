package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {
	public static void capturelogs(String classname, String message)
	{
		DOMConfigurator.configure("../YoutubeFramework/LogLayout.xml");
		Logger l=Logger.getLogger(classname);
		l.info(message);
		
		
	}
	

}
