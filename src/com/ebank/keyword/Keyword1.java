package com.ebank.keyword;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.collections4.functors.SwitchClosure;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ebank.master.Lib;

public class Keyword1 {
//abcd
	private static final String Branchname15 = null;
	private static final String Baadreser = null;
	private static final String GOA = null;
	private static final String INDIA = null;

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Lib lb=new Lib();
		
		String Res=null;
		
		String ip="E:\\Liveselproject\\ebank\\src\\com\\ebank\\testdata\\keyword_data.xlsx";
		String po="E:\\Liveselproject\\ebank\\src\\com\\ebank\\results\\Keyword.xslx";

		FileInputStream fis= new FileInputStream(ip);
		BufferedInputStream bis=new BufferedInputStream(fis);
		XSSFWorkbook Wb=new XSSFWorkbook(bis);
		XSSFSheet Ws1=Wb.getSheet("TestCase");
		XSSFSheet Ws2=Wb.getSheet("TestSteps");
		XSSFSheet Ws3=Wb.getSheet("TestData");
		int Rc1=Ws1.getLastRowNum();
		System.out.println(Rc1);
	    int Rc2=Ws2.getLastRowNum();
	    for (int i = 0; i <=Rc1; i++) {
	    	String Exe= Ws1.getRow(i).getCell(2).getStringCellValue();
	    	
	    	if(Exe.equalsIgnoreCase("Y")){
	    		String TcId= Ws1.getRow(i).getCell(0).getStringCellValue();
	    		System.out.println(TcId);
	    		for (int j = 0; j <=Rc2; j++) {
	    			String KTcId=Ws2.getRow(j).getCell(0).getStringCellValue();
	    			if(TcId==KTcId){
	    				String Key=Ws2.getRow(j).getCell(3).getStringCellValue();
	    				switch (Key) {
						case "rLaunch":
							Res=lb.openapp();
						case "rLogin":
						lb.AdminLogin();
						case "rLogout":
							lb.Logout();
						case "rClose":
							lb.close();
						case "rRole":
							lb.role("Rolename23", "Cashier", "E");
							
	break;

						default:
							System.out.println("Pass valid Keyword");
							break;
						}
	    				Ws2.getRow(j).createCell(4).setCellValue(Res);
	    				if(Ws2.getRow(j).createCell(4).getSt(Res).equalsIgnoreCase("Pass")){
	    					Ws1.getRow(i).createCell(3).setCellValue(Res);
	    				}
	    				else{
	    					
	    				}
	    			}
	    			
					
				}
	    	}
			
		}
	}

}
