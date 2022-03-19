//Sum of digits using recursion method:
import java.util.*;
public class Recursion {
	public static Scanner input;
	public static void main(String[] args) {
		input=new Scanner(System.in);
		// TODO Auto-generated method stub
		int Number,result;
		Number=input.nextInt();
		result=sum(Number);
		System.out.println(result);
	}
	public static int sum(int n) {
		if(n!=1) {
			return n*sum(n-1);
		}
		else {
			return n;
		}
	}

}