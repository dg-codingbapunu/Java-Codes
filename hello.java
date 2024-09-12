class Human 
{
   private int age;
   private String name;
   private int rollNo;

public int getAge()
{
  return age;
}
public void setAge(int a)
{
  age = a;
}

public String getName()
{
  return name;
}
public void setName(String n) 
{
  name = n;

}
public int getRoll()
{
  return rollNo;
}

public void setRoll(int r) 

{
rollNo = r;
}

}


public class Hello 
{
  public static void main(String[] args) {
Human obj = new Human();
obj.setAge(22);
obj.setName("bapunu");
obj.setRoll(143);
System.out.println(obj.getName() + " : " + obj.getAge() + " : " + obj.getRoll());

    
  }
}