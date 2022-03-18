//methods with arguments without return type
import java.util.Scanner;
public class addition_with_argument_without_return_type {
	public static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		add(a,b);
		sub(a,b);
	}
	public static void add(int a,int b) { 	//method definition
		int add=a+b;
		System.out.println(add);
	}
	public static void sub(int a,int b) {
		int sub=a-b;
		System.out.print(sub);
	}

}
