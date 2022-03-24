import java.util.*;
public class Vector1 {
	public static void main(String args[]) {
		Vector<String> a1=new Vector<String>();
		a1.add("Ravi");
a1.add("Vijay");
a1.add("siva");
a1.add(2,"michael");
System.out.println(a1.get(1));
a1.add("Karthik");
a1.remove(2);
Iterator<String> itr=a1.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
	}
}
}
