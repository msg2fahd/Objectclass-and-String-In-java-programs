class Student
{
 String name;
 int rollno;
 Student(String name, int rollno)
 {
   this.name= name;
   this.rollno=rollno;
 }
public boolean equals(Object obj) 
{
  String name1 = this.name;
  int rollno1= this.rollno;
  Student s = (Student)obj;
 String name2 = s.name;
 int rollno2 = s.rollno;
if (name1.equals(name2) && rollno1==rollno2)
{
  return true;
}
else
{
  return false;
}
}
 
public static void main(String[]args)
{
Student s1 = new Student("fahad", 101);
Student s2 = new Student("jsbnt", 102);
Student s3 = new Student("bikram", 103);
Student s4= s1;
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
}
}
