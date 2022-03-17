import java.util.*;
public class Date_validity {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        String date=input.next();
        String arr[]=date.split("/");
        int dd=Integer.parseInt(arr[0]);
        int mm=Integer.parseInt(arr[1]);
        int yy=Integer.parseInt(arr[2]);
        if(yy>=1900 && yy<=9999) {
            if(mm>=1 && mm<=12) {
                if((dd>=1 && dd<=31) && (mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12))
                System.out.print("Valid");
                else if((dd>=1 && dd<=30)&&(mm==4||mm==6||mm==9||mm==11))
                System.out.print("Valid");
                else if((dd>=1 && dd<=28) && mm==2)
                System.out.print("Valid");
                else if(dd<=29 && mm==2 && (yy%400==0 || (yy%4==0 && yy%100!=0)))
                System.out.print("Valid");
                else
                System.out.print("Invalid");
            }
        }
    }
}