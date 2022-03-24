import java.util.*;
public class Linked_List1 {
    public static void main(String args[]) {
        LinkedList<String>a1=new LinkedList<String>();
        a1.add("ravi");
        a1.add("vijay");
        a1.add("siva");
        a1.add(2,"michael");
        a1.add("michael");
        a1.add("michael");
        a1.add("michael");
        a1.add("Mca");
        System.out.println(a1.peek());
        a1.addFirst("pugal");
        a1.addLast("abi");
        a1.remove("michael");
        a1.removeFirst();
        a1.removeLast();
        a1.removeFirstOccurrence("michael");
        a1.removeLastOccurrence("michael");
        //System.out.println(a1.get(1));
        //a1.add("Karthik");
        //a1.remove(2);
        Iterator<String> itr=a1.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(a1.peek());
    }
}