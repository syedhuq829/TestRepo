package homeWork;

import java.util.Arrays;

//import java.util.stream.Stream;

public class classHomeWork2 {

	public static void main(String[] args) {

// Answer A-for loop print all the number between 10 to 19
	
		for(int i = 10; i < 20; i++)  {
			
		System.out.print(i + " ");
		}
		
// Answer B (integer Array) ***		
		 
		int[] Array = new int[5];	    
	  
	    for (int i = 0; i < Array.length; i++) {
	           
	    Array[i] = i;
	                
		Array[0] = 20;
		Array[1] = 25;
		Array[2] = 36;
		Array[3] = 59;
		Array[4] = 83;
		System.out.print("\nInterger Array " + Array[i]);  
	    }	
	
// Answer B (String Array) ***	        
               
        String[] ArrayName = new String [5];
	    
	    ArrayName [0] = "Sam";
	    ArrayName [1] = "Smith";
	    ArrayName [2] = "Susan";
	    ArrayName [3] = "Samsung";
	    ArrayName [4] = "Stiven";
	    
	    System.out.println("\nString Array " +"Element at index 0,1,2,3,4:" + Arrays.toString(ArrayName));
      
      
 // Answer C (Sum of numbers) ***
      
      int num = 100, sum = 0;

      for(int i = 1; i <= num; ++i)
      {
           sum = sum + i;
          
      }
      System.out.println("Sum = " + sum);
                       
  	}

	} 


