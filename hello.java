import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student
{
int age;
String name;

public String toString() {
  return "Student [age=" + age + ", name=" + name + "]";
}

public Student(int age, String name) {
  this.age = age;
  this.name = name;
}


}



public class Hello 
{

  public static void main(String[] args) 
  {

    Comparator<Student> comp = ( i,  j) ->// comparator use own logic for sorting
    
   
     {
     
       return i.age > j.age ? 1:-1;
       
      
      
    
    };




List<Student> nums = new ArrayList<>();


nums.add(new Student(34, "john"));
nums.add(new Student(24, "rudra"));
nums.add(new Student(14, "sinu"));
nums.add(new Student(44, "Bapunu"));




      // samall to big number sorting 

Collections.sort(nums,comp);

for(Student s : nums)
{
  System.out.println(s);
}


  
  }
  
}