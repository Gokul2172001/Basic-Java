import java.util.*;
public class powerofanumber {
	public static Scanner power;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base,exponent;
		int result=1;
		power=new Scanner(System.in);
		System.out.println("Enter the base of a Number.");
		base=power.nextInt();
		System.out.println("Enter the exponent of a Number.");
		exponent=power.nextInt();
		while(exponent!=0) {
			result*=base;
			--exponent;
		}
		System.out.println("Value of the number is..."+result);

	}

}
