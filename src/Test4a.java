import java.util.Scanner;

public class Test4a
{
	public static void main(String args[])
       {
		System.out.println("enter characters");
	Scanner sc = new Scanner(System.in);
	int count = 0;
	String st = sc.nextLine();
	char ch = st.charAt(0);
    
	StringBuffer sb = new StringBuffer();
	for (int i = 0; i < st.length(); i++)
	{

	if (ch == st.charAt(i))
	{

	count++;
	}
	else
	{
	sb.append(ch + "" + count);
	count = 1;
	ch = st.charAt(i);
	}

	}
	sb.append(ch + "" + count);
	System.out.print(sb);
	sc.close();

	}
	}
