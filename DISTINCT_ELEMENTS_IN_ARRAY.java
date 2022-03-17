import java.util.*; 
public class DISTINCT_ELEMENTS_IN_ARRAY {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in); 
        int num=input.nextInt();
        int arr[]=new int[num];
        int rep[]=new int[100];
        for(int index=0;index<num;index++) {
            arr[index]=input.nextInt();
            rep[arr[index]]++;
        }
        for(int index=0;index<num;index++) {
            if(rep[arr[index]]==1) {
                System.out.print(arr[index]+" ");
            }
        }
    }
}