import java.util.*;
public class reverse {
	public static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0,rem,n;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		System.out.println("Enter the number..."+n);
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println("Reverse of the number is "+rev);
	}

}