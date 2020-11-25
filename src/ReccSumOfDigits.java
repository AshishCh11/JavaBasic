
public class ReccSumOfDigits {
	public static void main(String args[])
	{
		System.out.println(getSum(223));
	
	}

	static int getSum(int no) {
		int sum=0;
		
		while(no>0){
		sum+=no%10;
		no=no/10;
		}
		return sum;
		
		
	}
}