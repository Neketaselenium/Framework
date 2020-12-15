package org.testing.runner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Runner {
	
	public static void main(String[] args) throws BiffException, IOException {
		
		XmlSuite xs= new XmlSuite();
		xs.setName("Suite");
		XmlTest xt= new XmlTest(xs);
		File f= new File("..//YoutubeFramework//Testcases.xls");
		Workbook wb= Workbook.getWorkbook(f);
		Sheet s=wb.getSheet(0);
		int r=s.getRows(); 
		ArrayList<XmlClass> al= new ArrayList<XmlClass>();
		for(int i=0;i<r;i++)
		{
			Cell c=s.getCell(4, i);
			if(c.getContents().equals("Y"))
					{
				       Cell packagename=  s.getCell(2,i);
				       Cell classname= s.getCell(3,i);
				       String v=packagename.getContents()+"."+classname.getContents();
				       XmlClass c1= new XmlClass(v);
				       al.add(c1);
					}
		}
		
		System.out.println(al.size());
		xt.setClasses(al);
		ArrayList<XmlTest> al1= new ArrayList<XmlTest>();
		al1.add(xt);
		xs.setTests(al1);
		ArrayList<XmlSuite> al2= new ArrayList<XmlSuite>();
		al2.add(xs);
		
		TestNG t= new TestNG();
		t.setXmlSuites(al2);
		t.run();
		
		
		
	}

}
