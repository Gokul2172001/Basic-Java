import java.util.*;
//import java.util.Stack;
public class PriorityQueue1 {
    public static void main(String args[]) {
        PriorityQueue<String>s1=new PriorityQueue<String>();	
        s1.add("apple");
        s1.add("pugal");
        s1.add("dhanus");
        s1.add("abi");
        s1.add("krish");
        System.out.println(s1.element());
        System.out.println(s1.peek());
        System.out.println("Now we going to iteration the elements");
        Iterator<String>itr=s1.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        s1.remove();
        s1.poll();
        System.out.println("After the process of removing and poll");
        Iterator<String>itr2=s1.iterator();
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}