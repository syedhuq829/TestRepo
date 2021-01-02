package homeWork;

import java.util.Scanner;

public class mainRun {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	homeWork2_NonRunnable home2	 = new homeWork2_NonRunnable(); 
	
//D.1. Function add3Numbers:
	
	int n1 = 34;
	int n2 = 56;
	int n3 = 105;
	
    int sum = home2.add3Numbers(n1,n2,n3);
    
    System.out.println("Sum of 3 numbers are:" + sum);
    
 //D.2. Function printData:    
    
    String name = home2.printData("xyz");

        System.out.println("Agile1Tech" + name);
        
//D.3. Function checkEquality:   
                
        int num = home2.checkEquality(20,16);
	    //System.out.println(num);
	    
//D.4. Function printName:
	    
        System.out.println("What is your Name? "+ name);
        home2.printName("");
	    
//D. 5. Function print boolean:
        
        home2.printboolean(34, 56);
        
        sc.close();
	
	}

	
	}

	


