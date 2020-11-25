import java.util.Scanner;

public class PrimeNoN {
  
	static boolean isPrime(int n) 
	{ 

	for (int i = 2; i < n/2; i++) 
	    if (n % i == 0) 
	        return false; 
	    
	return true; 
	} 
	 
	static void printPrime(int n) 
	{ 
	for (int i = 11; i <= n; i++)  
	{ 
	    if (isPrime(i)) 
	        System.out.print(i + " "); 
	} 
	} 

	public static void main(String[] args)  
	{ 
	    int n = 20; 
	    printPrime(n); 
	} 
	} 