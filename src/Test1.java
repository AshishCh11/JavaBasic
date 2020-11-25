import java.util.Scanner;

public class Test1 {
	 public static void main(String [] args){
	      Scanner scn=new Scanner(System.in);
		  
		  System.out.print("please enter your 3 alphabets\t");
		  char [] c1=new char[3];
		  int count1,count2,count3;
		  count1=count2=count3=0;
		  
		  for(int i=0;i<c1.length;i++)
		    c1[i]=scn.next().charAt(0);
		//  c1[i]=scn.next().trim().charAt(0);
			
		System.out.println("here your alphabets that you enter\n");
		for(int i=0;i<c1.length;i++)
		  System.out.print(c1[i]+"\t");
		  
		  System.out.println("\n");
		  
		  for(int i=0;i<c1.length;i++)
		     for(int j=0;j<c1.length;j++)
			    for(int k=0;k<c1.length;k++)
				  	
				     if(i==j&&j==k){
	 				    System.out.print(c1[k]+"\t");
						//count1++;
						}
					else if(i==j){
					    if(j!=k){
						  System.out.print(""+c1[j]+c1[k]+"\t");
						//  count2++;
						  }
						  }
					else if(i==j){

						if(i!=j&&k!=j){
					    System.out.print(""+c1[j]+c1[k]+"\t");
					     // count3++;
						  }
					}
	         	else if(i!=j&&i!=k&&j!=k){
						  System.out.print(""+c1[i]+c1[j]+c1[k]+"\t");
						  count3++;
					  }	
}
}