import java.util.*;
public class Swapping_String {
	public static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input=new Scanner(System.in);
		String word=input.nextLine();
		//String check[]=word.split(" ");
		int count=0;
		//String temp=check[0];
		//check[0]=check[(check.length)-1];
		//check[(check.length-1)]=temp;
		//System.out.println(Arrays.toString(Check));
		for(int i=0;i<word.length();i++) {
			//System.out.print(check[i]+" ");
			count=count+1;
		}
		System.out.println("The count of characters is: "+count);
	}

}
