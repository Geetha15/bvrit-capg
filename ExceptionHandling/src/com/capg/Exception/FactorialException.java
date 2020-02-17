package com.capg.Exception;
import java.util.*;
import java.io.*;
public class FactorialException  {

	public static void main(String []args) throws Exception{
		 int n,f=1;
			Scanner s=new Scanner(System.in);
			 n=Integer.parseInt(s.nextLine());
		 try { 
			// n=Integer.parseInt(s.nextLine());
            if(n<0) {
            	throw new  Exception("Error occured");
            	//System.out.println("Error occured");
            }
            else {
			while(n>0) {
				f=f*n;
				n--;
			}
			System.out.println(f);}
		 }
		 catch(Exception ex) {
			 if(n<0)
				 System.out.println("Error occured n should be greater than one"+ex.getMessage());
		 }
		 System.out.println("Done");
	}

}
