//Java program for calculate factors of a number.
import java.util.Scanner;
class factorial
{
	public static Scanner sc;
	public static void main(String args[])
	{
		int number,i=1;
		int factorial=1;
		sc=new Scanner(System.in);
		System.out.println("Enter any number you want to find factorial...");
		number=sc.nextInt();
		for(i=1;i<=number;i++)
		{
		factorial=factorial*i;
		}
		System.out.println("The factorial number is "+factorial);
	}
}