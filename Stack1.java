import java.util.*;
public class Stack1 {
    public static void main(String args[]) {
        Stack<String>s1=new Stack<String>();
        s1.push("apple");
        s1.push("pugal");
        s1.push("dhanus");
        s1.push("abi");
        s1.push("krish");
        s1.pop();
        Iterator<String>itr=s1.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}