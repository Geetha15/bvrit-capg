package com.capg.Exception;

import java.io.*;
import java.util.*;

public class ThrowsExample {
	public static void main(String []args)  {
		 
		try {
			readName();
		openFile("ThrowsExample.java");
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
		 
		public static void openFile(String fileName)throws Exception{
			FileReader in=new FileReader( fileName);
		}
		public static void readName() throws Exception{
		String name;
		name =new Scanner(System.in).nextLine();
		if(name.length()<3) {
			throw new  Exception("name should be of 3+ chars");
		}
		}
 		 
}


 
