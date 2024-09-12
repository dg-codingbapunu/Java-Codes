class Human 
{
   private int age;
   private String name;
   private int rollNo;

public Human()   // default constructer
{
 age = 22;
 name = "bapunu";
 rollNo = 34;
}
public Human(int a, String n , int r) // parameterized constructor
{
name = n;
age = a;
rollNo = r;
}
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getRollNo() {
    return rollNo;
  }
  public void setRollNo(int rollNo) {
    this.rollNo = rollNo;
  }



}


public class Hello 
{
  public static void main(String[] args) 
  {

Human obj = new Human(16 , "bapunu", 143);


System.out.println(obj.getName() + " : " + obj.getAge() + " : " + obj.getRollNo());
// obj.setAge(22);
// obj.setName("bapunu");
// obj.setRollNo(143);
// System.out.println(obj.getName() + " : " + obj.getAge() + " : " + obj.getRollNo());

 
}

}