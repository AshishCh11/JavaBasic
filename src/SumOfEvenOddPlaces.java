import java.util.Scanner;

public class SumOfEvenOddPlaces {
	
		public static void main(String args[])
		{
	       Scanner sc=new Scanner(System.in);
	       System.out.println("enter a no :");
	       int no=sc.nextInt();  //421
	    
	       int cnt=1;
	       int rev=0;
	       int even=0;
	       int d;
	       int odd=0;
	       while(no>0){
	    	
	    	     d=no%10;
	    	   rev=(rev*10)+d;
	    	   no=no/10;
	    	  
	    	   
	       } 
	       System.out.println(rev);
	       no=rev;
	    	   
	       while(no>0){   
	      d=no%10;
	      if(cnt%2==0)
	      {
	    	even+=d;  // 2           
	    	
	    	  
	       }
	    	else 
	    	{
				odd+=d;   // 4 1
					
	       }
	      no=no/10;
	       cnt++;
	       
	      
			
		}
	       System.out.println("sum at odd "+odd);
			System.out.println("sum at even "+even);
			
		}
	}
