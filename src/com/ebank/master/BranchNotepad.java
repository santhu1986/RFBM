package com.ebank.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BranchNotepad {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
              Lib lb=new Lib();
              lb.openapp();
              lb.AdminLogin();
              String Fpath="E:\\Liveselproject\\ebank\\src\\com\\ebank\\testdata\\Branch.txt";
              String Wpath="E:\\Liveselproject\\ebank\\src\\com\\ebank\\results\\Branch.txt";
              FileReader Fr= new FileReader(Fpath);
              BufferedReader Br=new BufferedReader(Fr);
              String FRead=Br.readLine();
//              System.out.println(FRead);
              //Write
              FileWriter Fw=new FileWriter(Wpath);
              BufferedWriter Bw= new BufferedWriter(Fw);
              Bw.write(FRead);
              Bw.newLine();
              String SD;
           
		      // Read and write from 2nd line using while loop
              while ((SD=Br.readLine())!=null) {
            	  
            	  System.out.println(SD);
            	  String Data[]=SD.split("@@");
            	  String BN=Data[0];
            	  String BA=Data[1];
            	  String ZC=Data[2];
            	  String CY=Data[3];
            	  String SE=Data[4];
            	  String CI=Data[5];
            	
            	  
            	  String RE=lb.Branch(BN,BA,ZC,CY,SE,CI);
             	  System.out.println(RE);
            	  
            	  Bw.write(BN+"  "+BA+"  "+ZC+"  "+CY+"  "+SE+"  "+CI);
                  Bw.newLine();
                  
                  
            	 }
              Bw.close();
              Fr.close();
				
			lb.Logout();
			lb.close();
              
	}   

}
