//Java program for calculate area of circle
import java.util.Scanner;
import java.lang.Math;
class areaofcircle
{
	private static Scanner sc;
	public static void main(String args[])
	{
		double radius,area,pi=3.14;
		sc=new Scanner(System.in);
		System.out.println("Please Enter the diameter of circle...");
		radius=sc.nextDouble();
		radius=radius/2;
		area=pi*radius*radius;
		System.out.println("The area o the circle is..... "+area);
	}
}