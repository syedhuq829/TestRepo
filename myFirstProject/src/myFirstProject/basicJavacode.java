package myFirstProject;

import java.text.NumberFormat;
import java.util.Locale;

public class basicJavacode {
	
// Task 2 - Assignment 1 and 2 //Syed Huq

	public static void main(String[] args) {
		
		String name = "Hellow World";
		
		System.out.println("It is a string variable, " + name);
		
		int num = 2020;
		
		int num1 = 301;
		
		int sum = (num + num1);
		
		int sub = (num - num1);
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
	    
		String total = nf.format(sum);

	    System.out.println("Sum of two numbers total is: "+ total  + " , " + "\"Syed Huq\"");
	   
	    NumberFormat nfs = NumberFormat.getInstance(new Locale("en", "US")); 
	    
	    String subtotal = nfs.format(sub);
	    
	    System.out.println("Subtraction of two numbers is: "+ subtotal + " , " + "Syed Huq");
	 	
      // Comparing three conditions with boolean
	   
	    int isClassIshelpfull = 10;
	    int selfLerning       = 7;

	      boolean flag = ( 10 > 7);

	      if(flag) {

	    	    System.out.println("Thanks for teachig us!" + isClassIshelpfull);

	      }   
	    	    else {
	    	 
	    	    System.out.println("Otherwise not know lot of things" +selfLerning);

	    	   }
	    
	   }      
    
	}


