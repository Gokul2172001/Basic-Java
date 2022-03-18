//changing the number of arguments
public class method_overloading_by_change_number_of_arguments {
	public static void sum(int a,int b) {
		System.out.println(a+b);
	}
	public static void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method_overloading_by_change_number_of_arguments obj =new method_overloading_by_change_number_of_arguments();
		obj.sum(10,10,10);
		obj.sum(20,20);
	}

}
