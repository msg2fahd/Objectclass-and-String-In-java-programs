class Test3
{
 int i;
 Test3(int i)
 {
   this.i=i;
 }
public String toString()
{
   return i+"";
}
 public int hashCode()
 {
    return i;
 }

public static void main(String[]args)
{
Test3 t1= new Test3(10);
Test3 t2= new Test3(100);
System.out.println(t1);
System.out.println(t2);
}
}

