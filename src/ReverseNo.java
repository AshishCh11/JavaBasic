import java.util.Scanner;

public class ReverseNo {
	public static void main(String args[])
	   {
	      int num=0;
	      int reversenum =0;
	      System.out.println("Input your number and press enter: ");
	      //This statement will capture the user input
	      Scanner in = new Scanner(System.in);
	      //Captured input would be stored in number num
	      num = in.nextInt();
	     
	    //  for( ;num != 0; )
	    	while(num>0) 
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }

	      System.out.println("Reverse of specified number is: "+reversenum);
	   }
	   }

