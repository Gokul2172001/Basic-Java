import java.util.*;
public class PinGenerationModel1 {
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			int inp1=input.nextInt();
			int inp2=input.nextInt();
			int inp3=input.nextInt();
			int odd=0,even=0;
			String s1=String.valueOf(inp1);
			String s2=String.valueOf(inp2);
			String s3=String.valueOf(inp3);
			String s= s1+s2+s3;
			//System.out.println(s1);
			//System.out.println(s2);
			//System.out.println(s3);
			int arr[]=new int[s.length()];
			//int j=Arrays.toString(arr);
			System.out.println(s);			
			for(int i=0;i<s.length();i++) {
				arr[i]=s.charAt(i);
				if(arr[i]%2==0) {
					even=even+arr[i];
				}
				else {
					odd=odd+arr[i];
				}
			}
			int value=even-odd;
			System.out.println(value);
			for(int i=0;i<s.length();i++) {
				System.out.print(arr[i]+" ");
			}
		
		}
}
