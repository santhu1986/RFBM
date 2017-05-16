package com.ebank.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employeexssf {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         Lib lb=new Lib();
         lb.openapp();
         lb.AdminLogin();
         FileInputStream fis=new FileInputStream("E:\\Liveselproject\\ebank\\src\\com\\ebank\\testdata\\employee.xlsx");
         XSSFWorkbook wb=new XSSFWorkbook(fis);
         XSSFSheet ws= wb.getSheet("EmpData");
         int Rc=ws.getLastRowNum();
         System.out.println(Rc);
         for (int i = 0; i <=Rc; i++) {
        	 XSSFRow WR= ws.getRow(i);
        	 XSSFCell C1=WR.getCell(0);
        	 XSSFCell C2=WR.getCell(1); 
        	 XSSFCell C3=WR.getCell(2);
        	 XSSFCell C4=WR.getCell(3);
        	 XSSFCell C5=WR.createCell(4);
        	 String Emname=C1.getStringCellValue();
        	 String pwd=C2.getStringCellValue();
        	 String role=C3.getStringCellValue();
        	 String branch=C4.getStringCellValue();
        	 String Res=lb.Employee(Emname, pwd, role, branch);
        	 System.out.println(Res);
        	 C5.setCellValue(Res);
        	 
		}
         FileOutputStream fos=new FileOutputStream("E:\\Liveselproject\\ebank\\src\\com\\ebank\\results\\Employee.xlsx");
         wb.write(fos);
         wb.close();
	lb.Logout();
	lb.close();
	}
	
}
