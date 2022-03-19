
public class Copy_Constructor {
	int id;
	String name;
	Copy_Constructor(int i,String n) {
		id=i;
		name=n;
	}
	Copy_Constructor(Copy_Constructor s) {
		id=s.id;
		name=s.name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copy_Constructor s1=new Copy_Constructor(111,"Karen");
		Copy_Constructor s2=new Copy_Constructor(s1);
		s1.display();
		s2.display();
	}

}
