package com.ebank.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws IOException 
	{
		Lib lb=new Lib();
		
		lb.openapp();
		lb.AdminLogin();
		
		String Fpath="E:\\Liveselproject\\ebank\\src\\com\\ebank\\testdata\\Role.txt";
		String Rpath="E:\\Liveselproject\\ebank\\src\\com\\ebank\\results\\resrole.txt";
		String SD;
		//read 
		
		FileReader FR=new FileReader(Fpath);
		BufferedReader BR=new BufferedReader(FR);
		String Sread=BR.readLine();
		System.out.println(Sread);
		
		//write
		
		FileWriter Fw=new FileWriter(Rpath);
		
		BufferedWriter Bw=new BufferedWriter(Fw);
		Bw.write(Sread);
		Bw.newLine();
		
		//while loop
		
		while((SD=BR.readLine())!=null)
		{
			System.out.println(SD);
	  String SR[]=SD.split("###");
	  
	 String Rname=SR[0];
	 String Rde=SR[1];
	 String Rty=SR[2];
	 
	String res=lb.role(Rname,Rde,Rty);
	System.out.println(res);
	
	Bw.write(Rname+"@@@"+Rde+"&&&"+Rty+"%%%"+res);
	Bw.newLine();
		}
		Bw.close();
		BR.close();

	}

}
