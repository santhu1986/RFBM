package com.ebank.keyword;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ebank.master.Lib;

		// TODO Auto-generated method stub

	}
	Lib lb=new Lib();
	
	String Res=null;
	
	String ip="E:\\Liveselproject\\ebank\\src\\com\\ebank\\testdata\\keyword_data.xlsx";
	String po="E:\\Liveselproject\\ebank\\src\\com\\ebank\\results\\Keyword.xslx";

	FileInputStream fis= new FileInputStream(ip);
	BufferedInputStream bis=new BufferedInputStream(fis);
	XSSFWorkbook Wb=new XSSFWorkbook(bis);
	XSSFSheet Ws=Wb.getSheet("TestCase");
	
}
