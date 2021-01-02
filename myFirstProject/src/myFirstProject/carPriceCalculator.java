package myFirstProject;

import java.util.Scanner;

public class carPriceCalculator {
	
public static void main(String []args) {
	
	Scanner sc = new Scanner(System.in);
	double taxrate = 3; 
	
	double interestrate = 2;
	
	System.out.println("Enter the base car price");
	double baseCarPrice = sc.nextDouble();

	System.out.println("Enter the down payment");
	double downPayment = sc.nextDouble();

	System.out.println("Enter the admin fee");
	double adminFee = sc.nextDouble();

	System.out.println("Enter the warrenty amount");
	double warrentyAmount = sc.nextDouble();

	System.out.println("Enter the number of months to pay");
	double numberOfMonth = sc.nextDouble();

	double totalCarprice= baseCarPrice+adminFee+warrentyAmount; 

	double totalrCarpriceWithTax=totalCarprice-downPayment*(taxrate/100);

	double carPrice = totalrCarpriceWithTax+totalrCarpriceWithTax*(interestrate/100) ;

	System.out.println("The finance amount is");

	System.out.println(carPrice);


	double monthlyPayment = carPrice/numberOfMonth; 

	System.out.println(monthlyPayment);
sc.close();
	
}

}
