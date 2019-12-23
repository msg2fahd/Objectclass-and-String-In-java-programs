class Student3
{
 String name;
 int rollno;
 Student3(String name, int rollno)
 {
   this.name= name;
   this.rollno=rollno;
 }

public boolean equals(Object obj) 
{
try
{
  
  Student3 s = (Student3)obj;
 
if (name.equals(s.name) && rollno == s.rollno)
  {
  return true;
  }
 else
  {
  return false;
  }
}

catch(ClassCastException e)
 { 
   return false;
}
catch (NullPointerException e)
{
return false;
}


 
}

public static void main(String[] args)
{
Student3 s1 = new Student3("fahad", 101);
Student3 s2 = new Student3("jsbnt", 102);
Student3 s3 = new Student3("fahad", 101);
Student3 s4= s1;
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
System.out.println(s1.equals("durga"));
System.out.println(s1.equals(null));
}
}





