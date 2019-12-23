class Cat
{
  int j;
 Cat(int j)
{
  this.j= j;
}
}
class Dog implements Cloneable
{
 Cat c;
 int i;
Dog(Cat c,int i)
{
this.c=c;
this.i=i;
}
public Object clone() throws CloneNotSupportedException
{
 return super.clone();
}
}
class ShalowcloningDemo
{
 public static void main(String[]args) throws CloneNotSupportedException
{
 Cat c = new Cat(20);
 Dog d1 = new Dog(c,10);
 Dog d2=(Dog)d1.clone();
 d2.i=888;
 d2.c.j=999;
System.out.println(d1.i+"....."+d1.c.j);
}
}
