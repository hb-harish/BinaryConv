import java.util.Scanner;

public class BinaryConv {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number in Binary form");
		int bin = sc.nextInt();
		double sum = 0;
		int i = 0;
		while (bin>0)
		{
			int digit = bin % 10;
			sum = sum + digit * Math.pow(2, i);
			i = i+1;
			bin = bin/10;
			
		}
		System.out.println("The number in Binary form is   :" + sum);
	}

}
