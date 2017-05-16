package com.ebank.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Libexe {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Lib lb=new Lib();
		//Libarg lba=new Libarg();
		//lba.openapp("http://192.168.1.200/ranford2/home.aspx");
		//lba.AdminLogin("Admin","Admin");
		lb.openapp();
		lb.AdminLogin();
 		//lb.Branch();
		// lb.Employee();
		//lb.Logout();
		//lb.close();
		
		FileInputStream Fis=new FileInputStream("E:\\Liveselproject\\ebank\\src\\com\\ebank\\testdata\\Role.xlsx");
		
		//Workbook
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		
		//sheet
		
		XSSFSheet WS=WB.getSheet("Roledata");
		
		//Row count
		
		int Rc=WS.getLastRowNum();
		System.out.println(Rc);
		
		//loop----For loop
		
		for (int i=1; i<=Rc; i++) 
		{
			//Row
			
			XSSFRow WR=WS.getRow(i);
			
			//Cell
			
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
					XSSFCell WC2=WR.getCell(2);
					XSSFCell WC3=WR.createCell(3);
					
					String Rname=WC.getStringCellValue();
					String Rdes=WC1.getStringCellValue();
					String Rtyp=WC2.getStringCellValue();
					
					String Res=lb.role(Rname,Rdes,Rtyp);
					System.out.println(Res);
					
					WC3.setCellValue(Res);
					
		}
		FileOutputStream Fos=new FileOutputStream("E:\\Liveselproject\\ebank\\src\\com\\ebank\\results\\Roleres.xlsx");
		WB.write(Fos);
		WB.close();
		
		
		
		
		
		
		
	}

}
