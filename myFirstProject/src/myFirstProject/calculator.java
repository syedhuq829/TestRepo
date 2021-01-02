package myFirstProject;

import java.util.Scanner;

//import org.openqa.selenium.By;

//import java.text.DecimalFormat;

public class calculator {

	public static void main(String[] args) {
		
//Assignment 3 and 4

//private static DecimalFormat df2 = new DecimalFormat("#.##"); //df2
			
// public static void  main(String [] args)  {
			 
			 double baserent = 1550.00;
			 
			 double utility = 220.90;
			 
			 double parkingcharge = 75.60;
			 
		     double renttotal = (baserent+utility+parkingcharge);
			
		     // 2 decimal points
		     System.out.println("Monthly house rent total is: "+ String.format("%,.2f", renttotal));
		     
		 	// Temperature conversion
		     
		    int farenhite_temperature = 95;
		    int farenhiteToCelsius = (farenhite_temperature - 32) * 5 / 9;
		    
		   System.out.println("Temperature conversion farenhite To Celsius is: " + farenhiteToCelsius +"\'C.");
		     
		// how arays and for loop works, aray must declared the how many times vale would be used
		// for loop will the variable start the initial value (i), condition either the intial variable less or greater the aray value
		// third increase initial variable value by 1 (i++) 
		 /*
		   
		   double grades [] = {96.5,98.7,99.5,90.1,88.4,86.3};

		   int i;

		   for(i = 0; i <= 5; i++)

		  {

		   System.out.println("Grade number " + i + " is " + grades[i]);


		  }
		     
		 // get the highest number from the list elemnts
		  
		   double gradesNew [] = {96.5,98.7,99.5,90.1,88.4,86.3};
		   double max;
		   
		   int y;
		   max = gradesNew[0];

		   for(y = 0; y <= 5; y++)
		   {
			  if(gradesNew[y] >max ) max = gradesNew[y];
		   }
		   {
			   System.out.println("\n\nThe max gradesNew in the class is "+ max);
		   }
		     
		   // usisng loop with int
		int numbers [] = new int[10];
		 int x;
		 
		 for(x = 0; x <= 9; x++)
		   
		 { numbers [x] = x + 0;
			 
		 }
		   
		 for(x = 0; x <= 9; x++)
			 
		 {
			 System.out.println(numbers[x]);
			 
		 }
		     
		 for(int z = 0 ;z <= 12; z++) {

				//System.out.println("testing to print");
				System.out.println(z);
			} 
		     */
		   //public void add3Numbers() {

		    int num1 = 15;
			int num2 = 23;
			int num3 = 33;
			int sum = (num1+num2+num3);
			
			System.out.println("Sum of 3 numbers are:" + sum);
		//1 End    
		     //}
		     
		     //public void printData() {
		     	
		         String name = "Agile1Tech";
		         
		         System.out.println(name);
		         
		//2 End
		         
		         int nums1 = 22;
		         int nums2 = 25;
		         
		         boolean flag = (nums1==nums2);
		         
		         if(flag) {

		     	    System.out.println("Is Num1 equal to num2");

		       }   
		     	    else {
		     	 
		     	    System.out.println("Num1 not equal to num2");

		     	   }
		 //3 End
		   /*      
		         Scanner sc = new Scanner(System.in);
		  	   
		  	   String myname = "Mr.";
		  	      
		  	   System.out.println("What is your Name? "+ myname);
		  	   
		  	   myname = sc.next();
		  	 
		  	   sc.close(); */
		 //4 End 	           
		  /*    
		     Scanner sc = new Scanner(System.in);
		 	
		     int numm1 = 0;
		     int numm2 = 0;
		     
		     System.out.println("Enter the number for numm1" );
		     numm1 = sc.nextInt();
		     
		     System.out.println("Enter the number for numm2");
		     numm2 = sc.nextInt();
		     
		     if(numm1 == numm2) {
		    	 
		     System.out.println("number 1  is equal to number 2");
		     }
		  	     
		     if(numm1 > numm2) {
		  	    	 System.out.println("number 1 is greater than number 2");
		     }
		     
		      //sc.close();
		}*/

		    // public double printRate(double num) {
		     /*	
		    	Scanner sc = new Scanner(System.in);
		    	 	
		        int creditscore     = 0;
		        double interestrate = 0;
		         
		         System.out.println("Enter the creditscore");
		         creditscore = sc.nextInt();
		        
		         System.out.println("Enter the interestrate");
		         interestrate = sc.nextInt();
		     
		     } */
		  
		     Scanner sc = new Scanner(System.in);
		     
		    //double interestrate = 0;
		     int creditscore     = 0;
		 
		  	System.out.println("Enter the base home price");
		 	double basehomePrice = sc.nextDouble();
		 	
		 	System.out.println("Enter the creditscore");
		    creditscore = sc.nextInt();
		 	
		    if(creditscore>=700) {
		    }
		   else if(creditscore<=699) {
		   //("Enter the interestrate 2.5");
		    }  
		 	System.out.println("Credit Score Greater Than 700 Enter the interestrate 1.5 ");
		 	System.out.println("Credit Score between 650 and 699 Enter the interestrate 2");
		 	double interestrate = sc.nextDouble(); 
		 	 	
		 	System.out.println("Enter the number of months to pay");
			double numberOfMonth = sc.nextDouble();
		 	
		 	double totalPrice = basehomePrice+basehomePrice*(interestrate/100) ;
		     
		 	System.out.println("The finance amount is");

			System.out.println(totalPrice);
			
			double monthlyPayment = totalPrice/numberOfMonth;
			System.out.println(monthlyPayment);
		     }
		}


	


