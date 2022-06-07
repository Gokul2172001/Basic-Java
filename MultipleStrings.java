
public class MultipleStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="hoe are you	gdhr grtgdg	grg";
  //String st=s.replaceAll(" ", "");
  String[] st1=s.split(" ");
  for(int i=0;i<st1.length;i++)
  {
	  System.out.print(st1[i]);
  }
  //System.out.println(st);
	}

}
