//Java program for find largest number among the three numbers.
import java.util.Scanner;
class largestnumamongthreenumbers {
	private static Scanner sc;
	public static void main(String args[]) {
		int number1,number2,number3;
		sc=new Scanner(System.in);
		System.out.println("Enter the first number....");
		number1=sc.nextInt();
		System.out.println("Enter the second number....");
		number2=sc.nextInt();
		System.out.println("Enter the third number....");
		number3=sc.nextInt();
		System.out.println("THE LARGEST NUMBER IS....................");
		if(number1<number2) {
			if(number2<number3) {
				System.out.println(+number3);
			}
			else {
				System.out.println(+number2);
			}
		}
		else {
			System.out.println(+number1);
		}
	}
}		