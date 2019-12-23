import java.lang.reflect.*;
class Test
{
  public static void main(String[]args)
{
  int count=0;
  Object o = new String("fahad");
  Class c = o.getClass();
  System.out.println("Fully qualified name of class:"+c.getName());
  Method[] m = c.getDeclaredMethods();
  System.out.println("MEthods info:");
  for (Method m1:m)
  {
    count++;
   System.out.println(m1.getName());
}
System.out.println("no of methods:"+count);
}
}

