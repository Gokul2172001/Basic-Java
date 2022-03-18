//Method with arguments with return type
public class Addition_using_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=10;
		int c=add(a,b);//method call
		System.out.print(c);

	}
	public static int add(int a, int b) //method definition with arguments
	{
		int d=a+b;
		return d;
	}

}
