
public class Copy_Constructor2 {
	int id;
	String name;
	Copy_Constructor2(int i,String n) {
		id=i;
		name=n;
	}
	Copy_Constructor2() {}
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copy_Constructor2 s1=new Copy_Constructor2(111,"Karan");
		Copy_Constructor2 s2=new Copy_Constructor2();
		s2.id=s1.id;
		s2.name=s1.name;
		s1.display();
		s2.display();

	}

}
