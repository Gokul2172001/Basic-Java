abstract class Bike8
{
abstract void run();
}
class Honda4 extends Bike8
{
void run()
{
System.out.println("running safetly..");
}
public static void main(String args[])
{
Bike8 obj=new Honda4();
obj.run();
}
}
