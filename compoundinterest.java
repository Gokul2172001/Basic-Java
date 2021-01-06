//Java program for find compund interest.
import java.util.Scanner;
class compoundinterest {
	private static Scanner sc;
	public static void main(String args[]) {
		int p_amount,t_period;
		double interst,f_ci,ci;
		sc=new Scanner(System.in);
		System.out.println("Enter the principal amount...");
		p_amount=sc.nextInt();
		System.out.println("Enter the interst in per hundred...");
		interst=sc.nextDouble();
		System.out.println("Enter the Time period in years...");
		t_period=sc.nextInt();
		f_ci=p_amount*(Math.pow((1+interst/100),t_period));
		ci=f_ci-p_amount;
		System.out.println("The future compount interst in given amount is....."+f_ci);
		System.out.println("The compund interst in given amout is...."+ci);
	}
}

		