class Tostring
{
String Name;
int RollNo;

Tostring(String Name,int RollNo)
{
this.Name=Name;
this.RollNo=RollNo;
}


public String toString()
{
return Name+"......"+RollNo;
}



public static void main(String[]args)
{
Tostring t1 = new Tostring("aaa",23);
Tostring t2 = new Tostring("bbb",24);
System.out.println(t1);
System.out.println(t1.toString());
System.out.println(t2);
}
}
