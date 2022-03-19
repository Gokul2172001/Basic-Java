//Constructor Overloading
public class Constructor_Overloading {
	int id;
	String name;
	int age;
	Constructor_Overloading(int i,String n) {
		id=i;
		name=n;
	}
	Constructor_Overloading(int i,String n,int a) {
		id=i;
		name=n;
		age=a;
	}
	void display() {
		System.out.println(id+" "+name+" "+age);
		//System.out.println(s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_Overloading s1=new Constructor_Overloading(111,"Karen");
		Constructor_Overloading s2=new Constructor_Overloading(111,"Aryan",25);
		s1.display();
		s2.display();
		//System.out.println(s1);
		//System.out.println(s2);

	}

}
