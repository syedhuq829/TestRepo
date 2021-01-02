package homeWork;

import java.util.Scanner;

public class HomeFinannceCalculator {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

//D.5 Function Print Boolean:
		
	    int y = 0;
	    int z = 0;
	       
	       System.out.println("Enter the number for y" );
	       y = sc.nextInt();
	       
	       System.out.println("Enter the number for z");
	       z = sc.nextInt();

           boolean flag = (y == z);
	       
	       if(flag) {
	      	 
	       System.out.println("Is Number Y equal to number Z");
	       }
	    	     
	       else {
	    	    	 System.out.println("Number Y not equal to number Z");
	       }
	    	     
//E.Calculate the the monthly home payment 
				
	    int creditscore = 0;
	   	 
	  	System.out.println("Enter the base home price");
	 	double baseHomePrice = sc.nextDouble();
	 	
	 	System.out.println("Enter the points and loan origination fees");
		double pointLoanOriginFee = sc.nextDouble();
	 	
	 	double housepriceWithFee = baseHomePrice+pointLoanOriginFee; 
	 	
	 	System.out.println("Enter the down payment");
		double downPayment = sc.nextDouble();
		
		double afterdownPaymentAmount = housepriceWithFee - downPayment;
	 	
	 	System.out.println("Enter the credit score");
	    creditscore = sc.nextInt();
	   	
	    if(creditscore > 700) {
	   	
	     }
	    else if(creditscore<=699) {
	     }  
	    else if (creditscore<650) {
	     }
	    else {
	     }
	 	System.out.println("Credit Score Greater Than 700 Enter the interestrate 2.75 ");
	 	System.out.println("Credit Score between 651 and 699 Enter the interestrate 3");
	 	System.out.println("Credit Score 650 Enter the interestrate 3.5");
	 	System.out.println("Credit Score below 650 no loan approve");
	 	double interestrate = sc.nextDouble(); 
	 		 		 	
	 	double interestAmount = (afterdownPaymentAmount*(interestrate/100)*30);
	 	
	 	System.out.println("Enter the number of months to pay");
		double numberOfMonth = sc.nextDouble();
	 	
	 	double totalPrice = (afterdownPaymentAmount + interestAmount);
	 		 	 		 	
	 	System.out.println("The finance amount is");

		System.out.printf ("$%.2f\n", totalPrice );
		
		double monthlyInsuranceandTax = 600;
				
		double monthlyPayment = totalPrice/numberOfMonth + monthlyInsuranceandTax;
		System.out.printf("Monthly Payment is $%.2f\n", monthlyPayment);
		
		
//F	largest number among 3 numbers:	
		
		System.out.print("Input the 1st number: ");
		int num1 = sc.nextInt();
		   
		System.out.print("Input the 2nd number: ");
		int num2 = sc.nextInt();
		   
		System.out.print("Input the 3rd number: ");
		int num3 = sc.nextInt();
				   
		if (num1 > num2)
		if (num1 > num3)
		System.out.println("The greatest number is: " + num1);
		 
		if (num2 > num1)
		if (num2 > num3)
		System.out.println("The greatest number is: " + num2);
		   
		if (num3 > num1)
		if (num3 > num2)
		System.out.println("The greatest number is: " + num3);
		 
		sc.close();
	   
	     }
			
	}


