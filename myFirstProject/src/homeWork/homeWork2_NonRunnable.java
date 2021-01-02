package homeWork;

import java.util.Scanner;

public class homeWork2_NonRunnable {

//D.1. Function add3Numbers:
	
    public int add3Numbers(int num1,int num2,int num3) {
        	
    	  int sum = num1+num2+num3;
          return sum;  
    }

 //D.2. Function printData:
    
       public String printData(String name) {
    	
       //System.out.println(name);
    	
    	return "";
    	    }

//D.3. Function checkEquality:
       
       public int checkEquality(int num1,int num2) {
    	   
         
       boolean flag = (num1 == num2);
       
       if(flag) {

   	   System.out.println("Is Number 1 equal to number 2");

     }   
   	    else {
   	 
   	   System.out.println("Number 1 not equal to number 2");

   	   }
      	   return 0;
       }
 
 //D.4. Function printName:
       
       public String printName(String name) {
    	
    	   Scanner sc = new Scanner(System.in);
    	   
    	    name = "Mr.";
    	      
    	   //System.out.println("What is your Name? "+ name);
    	   
    	   name = sc.next();
    	   
    	   sc.close();
    	   
    	   return name;
    	 
    }

//5. Function printboolean:
       
      public int printboolean(int y, int z) {
    
       Scanner sc = new Scanner(System.in);
           
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
       
       sc.close();
       
      	return 0; 
       }  
    	 
}
