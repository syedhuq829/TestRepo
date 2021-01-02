package homeWork;

import java.util.Scanner;

public class UitlityClass {

	/*	760 - 1.5
	700 - 3
	650 - 4
	600 - 5
	less than 600 - no loan approval for you 
	i.	Function-1 will take credit score as input and return the interest rate
	function name: findInterestRate
	*/

  public double findInterestRate (double amt) {
	
	  Scanner sc = new Scanner(System.in);
	 	
      int creditscore     = 0;
      double interestrate = 0;
       
       System.out.println("Enter the creditscore");
       creditscore = sc.nextInt();
      
       System.out.println("Enter the interestrate");
       interestrate = sc.nextInt();
	 
	    //System.out.println("Credit Score Greater Than 700 Enter the interestrate 1.5 ");
	 	//System.out.println("Credit Score between 650 and 699 Enter the interestrate 2");
	 	//double interestrate = sc.nextDouble();  
	  
	 // System.out.println("Enter the base home price");
	 //	double basehomePrice = sc.nextDouble();
	 	
	 /*	System.out.println("Enter the creditscore");
	    creditscore = sc.nextInt();
	 	
	    if(creditscore>=700) {
	    }
	   else if(creditscore<=699) {
	   //("Enter the interestrate 2.5");
	    }  
	 	System.out.println("Credit Score Greater Than 700 Enter the interestrate 1.5 ");
	 	System.out.println("Credit Score between 650 and 699 Enter the interestrate 2");
	 	double interestrate = sc.nextDouble(); */
	 	 	
	 /*	System.out.println("Enter the number of months to pay");
		double numberOfMonth = sc.nextDouble();
	 	
	 	double totalPrice = basehomePrice+basehomePrice*(interestrate/100) ;
	     
	 	System.out.println("The finance amount is");

		System.out.println(totalPrice);
		
		double monthlyPayment = totalPrice/numberOfMonth;
		System.out.println(monthlyPayment); */
	    
	    //sc.close();
		
		return 0;
  }


}
