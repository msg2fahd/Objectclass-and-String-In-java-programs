class Student4
{
 String name;
 int rollno;
 Student4(String name, int rollno)
 {
   this.name= name;
   this.rollno=rollno;
 }

public boolean equals(Object obj) 
{
  if(obj==this)
   return true;
  if (obj instanceof Student4)
  {
  Student4 s = (Student4)obj;
  if (name.equals(s.name) && rollno == s.rollno)
  {
  return true;
  }
  else
  {
  return false;
  }
}
return false;

}


public static void main(String[] args)
{
Student4 s1 = new Student4("fahad", 101);
Student4 s2 = new Student4("jsbnt", 102);
Student4 s3 = new Student4("fahad", 101);
Student4 s4= s1;
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
System.out.println(s1.equals("durga"));
System.out.println(s1.equals(null));
}
}





