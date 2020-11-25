import java.util.Scanner;
//
//public class EvenOdd {
//public static void main(String args[])
//{
//	        Scanner reader = new Scanner(System.in);
//
//	        System.out.print("Enter a number: ");
//	        int num = reader.nextInt();
//
//	        String evenOdd = (num % 2 == 0) ? "even" : "odd";
//
//	        System.out.println(num + " is " + evenOdd);
//
//	    }
//}
class EvenOdd { 
    
    // Returns true if n  
    // is even, else odd 
    static boolean isEven(int n) 
    { 
        boolean isEven = true; 
          
        for (int i = 1; i <= n; i++)  
            isEven = !isEven; 
              
        return isEven; 
    } 
      
      
    // Driver Code 
    public static void main(String args[]) 
    { 
          
        int n = 101; 
        if(isEven(n)) 
            System.out.println("Even"); 
        else
            System.out.println("Odd"); 
          
    } 
} 