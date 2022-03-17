import java.util.*;
public class panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		boolean[] alphabet=new boolean[26];
		int index=0;
		int flag=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				index=str.charAt(i)-'A';
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				index=str.charAt(i)-'a';
			}
			alphabet[index]=true;
		}
		for(int i=0;i<=25;i++) {
			if (alphabet[i]==false)
				flag=0;
		}
		if(flag==1)
			System.out.print("TRUE");
		else
			System.out.print("FALSE");

	}

}
