package com.capg.Exception;
import java.io.*;
public class CheckedException {
	public static void main(String []args) {
		 
		try {
			FileReader in=new FileReader("CheckedException.java");
			int c;
		while((c=in.read())!=-1) {
			System.out.println((char)c);
		}
		}
		
		catch(Exception ex) {
			System.out.println("Error: "+ex);
		}
		finally {
			 
			System.out.println("Error handled");
		}
		
		System.out.println("Exception Done");
}
}
