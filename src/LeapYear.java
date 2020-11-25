import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {

    	int year;
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter any Year:");
    	year = scan.nextInt();
    	scan.close();
    
    	if(year%400==0 || year%4==0 && year%100!=0)
    	{
    		System.out.println("leap year ");
    	}
    	else
    	{
    		System.out.println("not");
    	}
	
	
	
	
	}
}
