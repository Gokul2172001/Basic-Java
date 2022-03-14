import java.util.Scanner;
public class MultiDimensional_Array
{
public static void main (String[] args) 
{
    Scanner sc=new Scanner(System.in);
    int t=3;
    int n=3;
    int m=3;
    int arr[][][]=new int[t][n][m];
   // arr[1][0][0]=10;
    //arr[1][0][1]=10;
    //arr[1][0][2]=10;
   // arr[1][1][0]=20;
    //arr[1][1][1]=20;
    //arr[1][1][2]=20;
    //arr[1][2][0]=30;
    //arr[1][2][1]=30;
    //arr[1][2][2]=30;
    //arr[2][0][0]=50;
    //arr[2][0][1]=50;
    //arr[2][0][2]=50;
    //arr[2][1][0]=100;
    //arr[2][1][1]=100;
    //arr[2][1][2]=100;
    //arr[2][2][0]=150;
    //arr[2][2][1]=150;
    //arr[2][2][2]=150;*/
    for(int i=0;i<t;i++)
        for(int j=0;j<n;j++)
        {
        for(int k=0;k<m;k++)
        {
            arr[i][j][k]=sc.nextInt();
            
        }
        System.out.println();
        }
    System.out.println("Select Normal of Balcony...");
    int i=sc.nextInt();
    System.out.println("Select the Row...");
    int j=sc.nextInt();
    System.out.println("Select the Column...");
    int k=sc.nextInt();
    System.out.println("You'r amount is :"+arr[i][j][k]); 

    
}
}