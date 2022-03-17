import java.util.*;
public class string_buff_append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		//String s2=input.nextLine();
		//String s3=input.nextLine();
		StringBuffer s1=new StringBuffer(s);
		//int a=input.nextInt();
		//int b=input.nextInt();
		//s1.append(s2);
		// 6 is an index value of string to insert the mca string
		//s1.insert(a,s3);
		//s1.replace(a,b,s2);
		//s1.delete(a,b);
		s1.reverse();
		System.out.println(s1);
	}

}
