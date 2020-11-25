
public class Swap3varWithoutTemp {
	public static void main(String args[])
	{
		int a = 2 ,b = 1 ,c = 3; 

				a = a+b+c;

				b = a -b-c; 
				c = a -b- c;
				a = a-b-c; 
				
		System.out.println("After swaping :");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);

	}
	 
	
}
