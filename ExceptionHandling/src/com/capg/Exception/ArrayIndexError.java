package com.capg.Exception;
import java.io.*;
public class ArrayIndexError {

	public static void main(String []args) {
		int []a= {0,1,2,3,4};
		try {
			int res=a[4]/a[1];
			Integer.parseInt("vg");
		}
		catch(ArithmeticException ex) {
			System.out.println("Divide by zero not allowed");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index exceeds the limit");
		}
		catch(Exception ex) {
			System.out.println(" Error "+ex);
		}
		finally {
			System.out.println("completed....");
		}
	}

 }

