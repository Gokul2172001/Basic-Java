import java.util.*;
//methods without arguments ith return typr
public class addition_methods_without_arguments_with_return_type {
	public static Scanner input;
	public static void main(String[] args) {
		input=new Scanner(System.in);
		// TODO Auto-generated method stub
		int c=add();
		int d=mul();
		System.out.println(c);
		System.out.print(d);

	}
	public static int add() { //method definition
		int a=5,b=10;
		int add=a+b;
		return add;
	}
	public static int mul() {
		int e=input.nextInt();
		int f=input.nextInt();
		int mul=e*f;
		return mul;
	}

}
