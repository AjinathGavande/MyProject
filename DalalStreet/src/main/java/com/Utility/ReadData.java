package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData
{
	public static String readData(String sheetname, int rownum, int cellnum) throws IOException
	{
	
	    String path = "D:\\GitHub\\DemoRepo04JuneMB\\MyProject\\MyProject\\DalalStreet\\src\\main\\java\\com\\TestData\\TestData.xlsx";
	
	    File file =new  File(path);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String data = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
	}
	
	public static void writeData(String sheetname, int rownum, int cellnum, String data) throws IOException
	{
	
	    String path = "D:\\GitHub\\DemoRepo04JuneMB\\MyProject\\MyProject\\DalalS";
	
	    File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).setCellValue(data);
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();
	
	}
	
	
	
}
