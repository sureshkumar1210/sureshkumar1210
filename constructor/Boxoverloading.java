class Boxoverloading
{
int height;
int weight;
int depth;
public Boxoverloading(int h,int w,int d)
{   
height=h;
weight=w;
depth =d;


}
public Boxoverloading()
{
depth=height=weight=0;
}
public Boxoverloading(int len)
{ 
 weight=height=depth=len;

}
double volume()
{
return weight*height*depth;
}
}

