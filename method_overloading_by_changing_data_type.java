
public class method_overloading_by_changing_data_type {
	public static void sum(int a,int b) {
		System.out.println(a+b);
	}
	public static void sum(double c,double d) {
		System.out.println(c+d);
	}

	public static void main(String[] args) {
		method_overloading_by_changing_data_type obj =new method_overloading_by_changing_data_type();
		obj.sum(10.5,10.5);
		obj.sum(20,20);
	}
	}

