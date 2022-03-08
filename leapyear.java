//Java program for find leap year.
import java.util.Scanner;
class leapyear
{
	private static Scanner sc;
	public static void main(String args[])
	{
		int year;
		sc=new Scanner(System.in);
		System.out.println("Enter the year...");
		year=sc.nextInt();
		if((year%400==0)||(year%4==0)&&(year%100!=0))
		{
			System.out.println(year+" is the leap year...");
		}
		else
		{
			System.out.println(year+" is not the leap year...");
		}
	}
}