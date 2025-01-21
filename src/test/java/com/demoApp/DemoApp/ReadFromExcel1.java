package com.demoApp.DemoApp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadFromExcel1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

File file=new File("C:\\Users\\DDILIPKA\\Desktop\\Testing\\Selenium\\DemoApp\\ExcelData\\data1.xls");
		
		//read from the data into excel sheet
		FileInputStream fis=new FileInputStream(file);
		
		Workbook w=new HSSFWorkbook(fis);
		
		Sheet s=w.getSheetAt(0);
		
		for(int i=0;i<s.getPhysicalNumberOfRows();i++)
		{
			Row r=s.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
			Cell c=r.getCell(j);
			System.out.println(c);
			}
		}
		
		int row=s.getLastRowNum();
		int col=s.getRow(1).getLastCellNum();
		
		for(int r=0;r<=row;r++)
		{
			Row ro=s.getRow(r);
			for(int c=0;c<col;c++)
			{
				Cell ce=ro.getCell(c);
				
				switch(ce.getCellType())
				{
				case STRING: System.out.print(ce.getStringCellValue());
				break;
				case NUMERIC: System.out.print(ce.getNumericCellValue());
				break;
				case BOOLEAN: System.out.print(ce.getBooleanCellValue());
				break;
				default:
					break;
					
				}
				System.out.print("|");
				
			}
			System.out.println();
		}
	}

}
