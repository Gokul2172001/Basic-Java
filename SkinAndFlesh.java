import java.util.Scanner;
public class SkinAndFlesh {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int skin=1,flesh=0;
		int arr[][]=new int[a][a];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				if((i==0)||(j==0)||(i==a-1)||(j==a-1)) {
					
				System.out.print(skin);
				}
				else {
					System.out.print(flesh);
				}
			}
			System.out.println();
		}
		 
	}

}
