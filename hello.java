
class Student {
  int rollno;
  String name;
  int marks;
}




public class Hello {

public static void main(String[] args) {
  Student s1 = new Student();
s1.rollno = 1;
s1.name = "Bapunu";
s1.marks = 90;

Student s2 = new Student();
s2.rollno = 2;
s2.name = "nandu";
s2.marks = 80;

Student s3 = new Student();
s3.rollno = 2;
s3.name = "sudhia";
s3.marks = 50;
Student students[] = new Student[3];
students[0] = s1;
students[1] = s2;
students[2] = s3;
  // for (int i = 0; i < students.length ; i ++) {
  //   System.out.println(students[i].name + " : " + students[i].marks);
  // }
for (Student stud : students) {
  System.out.println(stud.name + " : " + stud.marks + " rollnos : " + stud.rollno);
}

}
}