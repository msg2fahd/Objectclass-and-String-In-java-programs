class Student1
{
 String name;
 int rollno;
 Student1(String name, int rollno)
 {
   this.name= name;
   this.rollno=rollno;
 }

public boolean equals(Object obj) 
{
  String name1 = this.name;
  int rollno1= this.rollno;
  Student1 s = (Student1)obj;
  String name2 = s.name;
  int rollno2 = s.rollno;
if (name1.equals(name2) && rollno1 == rollno2)
  {
  return true;
  }
 else
  {
  return false;
  }
 
}

public static void main(String[] args)
{
Student1 s1 = new Student1("fahad", 101);
Student1 s2 = new Student1("jsbnt", 102);
Student1 s3 = new Student1("fahad", 101);
Student1 s4= s1;
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
//System.out.println(s1.equals("durga"));
}
}





