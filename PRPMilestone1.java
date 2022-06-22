import java.util.*;
public class PRPMilestone1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int inp1=input.nextInt();
		int inp2=input.nextInt();
		int inp3=input.nextInt();
		int arr1[]=new int[4];
		int arr2[]=new int[4];
		int arr3[]=new int[4];
		PRPMilestone1 obj=new PRPMilestone1();
		obj.validate(inp1,arr1);
		obj.validate(inp2,arr2);
		obj.validate(inp3,arr3);
		int value=((arr1[3]+arr2[3]+arr3[3])-(arr1[0]+arr2[0]+arr3[0]));
		System.out.println(value);
	}
		public static int validate (int temp , int[] arr)
		{
			int i=0;
		while(temp!=0) {
			arr[i]=temp%10;
			temp=temp/10;
			i++;
		}
		Arrays.sort(arr);
		return arr[3];
		}
		public static void show(int i , int arr1[]) {
		for(i=0;i<=3;i++) {
			System.out.print(arr1[i]+" ");
		}
		}

}
