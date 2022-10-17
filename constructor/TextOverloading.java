class TextOverloading
{
public static void main(String args[])
{
Boxoverloading mybox1=new Boxoverloading(3,5,6);
Boxoverloading mybox2=new Boxoverloading();
Boxoverloading mybox3=new Boxoverloading(8);
double vol;
vol=mybox1.volume();
System.out.println(vol);
vol=mybox2.volume();
System.out.println(vol);
vol=mybox3.volume();
System.out.println(vol);

}}
