package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelhandling {
	
	private static void readdataparticalurrow(int row) throws IOException
	{
		File f= new File("..//YoutubeFramework/Selenium Class Topics (Batch 22 Feb 11_30 AM) (2).xlsx");
		FileInputStream fr= new FileInputStream(f);
		XSSFWorkbook xw= new XSSFWorkbook(fr);
		XSSFSheet xs=xw.getSheetAt(0);
		int r=xs.getPhysicalNumberOfRows();
		for(int i=0;i<r;i++)
		{
			XSSFRow xr= xs.getRow(i);
			System.out.println(xr);
			
			for(int j=0;j<xr.getPhysicalNumberOfCells();j++)
			{
				XSSFCell xc= xr.getCell(j);
				System.out.println(xc.getStringCellValue());
			}
			
		}
		
	}
	
}
