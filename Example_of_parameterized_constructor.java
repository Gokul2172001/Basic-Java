
public class Example_of_parameterized_constructor {
	int id;
	String name;
	Example_of_parameterized_constructor(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_of_parameterized_constructor s1=new Example_of_parameterized_constructor(111,"Karan");
		Example_of_parameterized_constructor s2=new Example_of_parameterized_constructor(222,"Aryan");
		s1.display();
		s2.display();

	}

}
