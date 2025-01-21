package com.demoApp.DemoApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class DataTable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("C:\\Users\\DDILIPKA\\Desktop\\Testing\\Selenium\\DemoApp\\ExcelData\\data1.xls");
		
		//write the data into excel sheet
		FileOutputStream fos=new FileOutputStream(file);
		//create an excel sheet
		//workbook - 1)HSSF(old version)   2)XSSF(New version)
		Workbook w=new HSSFWorkbook();
		
		//create a sheet
		Sheet s=w.createSheet();
		
		//create a row
		s.createRow(0); //createRow(row_number);
		//create a cell
		s.getRow(0).createCell(0).setCellValue("Hello");
		s.getRow(0).createCell(1).setCellValue("Capg");
		
		s.createRow(1);
		s.getRow(1).createCell(0).setCellValue(true);
		s.getRow(1).createCell(1).setCellValue(10);
		
		//create another sheet
		Sheet s1=w.createSheet("Testing data");
		s1.createRow(0);
		s1.getRow(0).createCell(0).setCellValue(true);
		s1.getRow(0).createCell(1).setCellValue(10);
		
		w.write(fos);
		
		//close file
		w.close();
		
	}

}
