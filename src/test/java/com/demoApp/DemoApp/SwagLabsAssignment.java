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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLabsAssignment {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
        File file=new File("C:\\Users\\DDILIPKA\\Desktop\\Testing\\Selenium\\DemoApp\\ExcelData\\swaglabs.xlsx");
		FileOutputStream fos=new FileOutputStream(file);
		Workbook w=new XSSFWorkbook();
		Sheet s=w.createSheet();
		
		s.createRow(0); 
		s.getRow(0).createCell(0).setCellValue("standard_user");
		s.getRow(0).createCell(1).setCellValue("secret_sauce");
		
		s.createRow(1);
		s.getRow(1).createCell(0).setCellValue("locked_out_user");
		s.getRow(1).createCell(1).setCellValue("secret_sauce");
		
		w.write(fos);
		w.close();
		
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        
        String user=s.getRow(0).getCell(0).getStringCellValue();
        String pass=s.getRow(0).getCell(1).getStringCellValue();
       
        
        driver.findElement(By.id("user-name")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

        driver.close();
        
	}

}
