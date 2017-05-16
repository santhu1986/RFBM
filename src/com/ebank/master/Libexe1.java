package com.ebank.master;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Libexe1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	
		
	   Lib Lb1=new Lib();
	   Lb1.openapp();
	   Lb1.AdminLogin();
	  
	   // creating fileinput stream
	   FileInputStream Fis=new FileInputStream("E:\\Liveselproject\\ebank\\src\\com\\ebank\\testdata\\Branch.xlsx");
	   //creating workbook
	   
	   XSSFWorkbook WB1= new XSSFWorkbook(Fis);
	    
	   // creating sheet 
	   
	   XSSFSheet WS1=WB1.getSheet("BranchData");
	   // Row count 
	   
	   int R=WS1.getLastRowNum();
	   System.out.println(R);
	   
	   
	   
	   //Implementing Loop
	   for (int i= 1; i <=R; i++) {
		   // Getting data from sheet and inserting in Row 
		  XSSFRow WR1= WS1.getRow(i);
		  //Creating Cell 
		 XSSFCell C1=WR1.getCell(0);
		 XSSFCell C2=WR1.getCell(1);
		 XSSFCell C3=WR1.getCell(2);
		 XSSFCell C4=WR1.getCell(3);
		 XSSFCell C5=WR1.getCell(4);
		 XSSFCell C6=WR1.getCell(5);
		 XSSFCell C7=WR1.createCell(6);
		 
		 // getting values from xl
		 
		 String Brname= C1.getStringCellValue();
		 String BrAdd= C2.getStringCellValue();
		 String BrZc=C3.getStringCellValue();
		  String Ctry=C4.getStringCellValue();
         String State=C5.getStringCellValue();
         String City=C6.getStringCellValue();
         
         String RES= Lb1.Branch(Brname,BrAdd,BrZc,Ctry,State,City);
         System.out.println(RES);
         C7.setCellValue(RES);
		  
		
	}
	   FileOutputStream FOS= new  FileOutputStream("E:\\Liveselproject\\ebank\\src\\com\\ebank\\results\\BranchRes.xlsx");
	   WB1.write(FOS);
	   WB1.close();
	   

	   Lb1.Logout();
	   Lb1.close();
	}

	
}
