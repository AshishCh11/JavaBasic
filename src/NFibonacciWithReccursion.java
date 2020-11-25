// first n fibbonacci

public class NFibonacciWithReccursion {
	static int n1 = 0, n2 = 1, n3;
	   static void fibbonacci(int count) {
	      if (count > 0) {
	    	  System.out.print(" " + n1);
	         n3 = n1 + n2;
	         n1 = n2;
	         n2 = n3;
	        
	         fibbonacci(count - 1);
	         
	      }
	   }
	   public static void main(String args[]) {
	      int count = 20;
	      fibbonacci(count);
	     
	   }
	   
	}