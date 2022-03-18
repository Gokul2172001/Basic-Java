//Can we overload Main() Method?
public class method_main_overloading {
	public static void main(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() method invoked");
		main(10);

	}

}
