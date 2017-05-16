package com.ebank.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeNp {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      Lib lb=new Lib();
      lb.openapp();
      lb.AdminLogin();
      String Fpath="E:\\Liveselproject\\ebank\\src\\com\\ebank\\testdata\\employee.txt";
      String Rpath="E:\\Liveselproject\\ebank\\src\\com\\ebank\\results\\employee.txt";
      FileReader Fr=new FileReader(Fpath);
      BufferedReader Br=new BufferedReader(Fr);
      String Sd=Br.readLine();
      FileWriter Fw=new FileWriter(Rpath);
      BufferedWriter Bw= new BufferedWriter(Fw);
      Bw.write(Sd);
      Bw.newLine();
      String SD;
      while ((SD=Br.readLine())!=null) {
    	 String Data[]=SD.split("  ");
    	 String EN=Data[0];
    	 String PD=Data[1];
    	 String RE=Data[2];
    	 String BH=Data[3];
    	 lb.Employee(EN,PD,RE,BH);
    	 
    	 Bw.write(EN+"  "+PD+"  "+RE+"  "+BH);
    	 Bw.newLine();
    	
    			 
    	 
		
	}
      Bw.close();
 	 Br.close();
 	 
      lb.Logout();
      lb.close();
	}

}
