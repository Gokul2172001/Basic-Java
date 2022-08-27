import java.util.*;
public class PasswordChecker {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		int count=0;
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if('a'<=arr[i] && arr[i]<='z') {
				count+=1;
			}
		}
		System.out.println(count);
	}

}
