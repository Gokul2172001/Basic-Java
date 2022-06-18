import java.util.*;
public class PinGenerationModel1 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			int inp1=input.nextInt();
			int inp2=input.nextInt();
			int inp3=input.nextInt();
			int odd=0,even=0;
			String s1=String.valueOf(inp1);
			String s2=String.valueOf(inp2);
			String s3=String.valueOf(inp3);
			String s= s1+s2+s3;
			System.out.println(s);
			int arr[]=new int[s.length()];
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
			//int arr1[]=new int[4];
			//int arr2[]=new int[4];
			//int arr3[]=new int[4];
			//PRPMilestone1 obj=new PRPMilestone1();
			//obj.validate(inp1,arr1);
			//obj.validate(inp2,arr2);
			//obj.validate(inp3,arr3);
			//int value=((arr1[3]+arr2[3]+arr3[3])-(arr1[0]+arr2[0]+arr3[0]));
			//System.out.println(value);
		}
			//public static int validate (int temp , int[] arr)
			//{
				//int i=0;
			//while(temp!=0) {
				//arr[i]=temp%10;
				//temp=temp/10;
				//i=i+1;
			//}
			//Arrays.sort(arr);
			//return arr[3];
			//}
			/*public static void show(int i , int arr[]) {
				int odd=0,even=0;
			for(i=0;i<=3;i++) {
				if(arr[i]%2==0) {
					even=even+arr[i];
				}
				else {
					odd=odd+arr[i];
				}*/
			//}
			}

	

//}
