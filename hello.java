class Human 
{
   private int age;
   private String name;
   private int rollNo;
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

Human obj = new Human();
obj.setAge(22);
obj.setName("bapunu");
obj.setRollNo(143);
System.out.println(obj.getName() + " : " + obj.getAge() + " : " + obj.getRollNo());

    
  }
}