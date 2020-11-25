import java.util.Scanner;

public class SumOfDigitsWithoutLoop {
	public static void main(String args[])
	{
		System.out.print("Sum is :"+getSum(123));
		}

	static int getSum(int no) {
		int sum=0;
		while(no>0)
		{
		sum=sum+no%10;
		no=no/10;
		}
		
		
		return sum;
		
		
	}
}

