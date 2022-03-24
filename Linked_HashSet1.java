import java.util.*;
public class Linked_HashSet1 {
    public static void main(String args[]) {
        LinkedHashSet<String>s1=new LinkedHashSet<String>();
        s1.add("hari");
        s1.add("subha");
        s1.add("hari");
        s1.add("pugal");
        s1.add("arun");
        s1.add("siva");
        s1.add("abinaya");
        Iterator<String>itr=s1.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
