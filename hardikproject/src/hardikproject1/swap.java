package hardikproject1;

import java.util.Scanner;

public class swap {
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int i = in.nextInt();
		
		System.out.println("Enter the Second number:");
		int j = in.nextInt();
		
		//code for swapping
		i = i+j;
		j = i-j;
		i = i-j;
		
		System.out.println("After swapping the numbers:"+i+","+j);
	}

}
