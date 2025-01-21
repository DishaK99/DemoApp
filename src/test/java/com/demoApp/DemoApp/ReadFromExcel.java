package com.demoApp.DemoApp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file=new File("C:\\Users\\DDILIPKA\\Desktop\\Testing\\Selenium\\DemoApp\\ExcelData\\data1.xls");
		
		//read from the data into excel sheet
		FileInputStream fis=new FileInputStream(file);
		
		Workbook w=new HSSFWorkbook(fis);
		
		Sheet s=w.getSheetAt(0);
		
		Row r=s.getRow(0);
		
		Cell c=r.getCell(0);
		System.out.println(c);
		
		int rows=s.getFirstRowNum();
		int col=s.getRow(0).getFirstCellNum();
		
		System.out.println(rows);
		System.out.println(col);
		
		int row1=s.getLastRowNum();
		int col1=s.getRow(0).getLastCellNum();
		
		System.out.println(row1);
		System.out.println(col1);
		
		int rs=s.getPhysicalNumberOfRows();
		System.out.println(rs);
		
		int cols=s.getRow(0).getPhysicalNumberOfCells();
		System.out.println(cols);
		
		w.close();
		fis.close();
		
//File file=new File("C:\\Users\\DDILIPKA\\Desktop\\Testing\\Selenium\\DemoApp\\ExcelData\\data1.xls");
//		
//		//read from the data into excel sheet
//		FileInputStream fis=new FileInputStream(file);
//		
//		Workbook w=new HSSFWorkbook(fis);
//		
//		Sheet s=w.getSheetAt(0);
//		String cellValue=s.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(cellvalue);
//		Number cellValue1=s.getRow(0).getCell(0).getNumericCellValue();
		//System.out.println(cellvalue1);
//		w.close();
//		fis.close();
	}

}
