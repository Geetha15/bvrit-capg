//unchecked Execption 

package com.capg.Exception;
import java.util.*;
public class ExceptionExample {        
public static void main(String []args){
	 int n;
	 Scanner in=new Scanner(System.in);
	 try {
		n=Integer.parseInt(in.nextLine());
		// n=in.nextInt();
	 }
	 catch( Exception ex) {
		 System.out.println("Error occured "+ex);
	 }
	 System.out.println("Execution Done..");

}
}
