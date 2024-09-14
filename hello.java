class A 
{
  public void show()
  {
    System.out.println("in the A show");
  }
  public void config()
  {
    System.out.println("In Config");
  }
}
 class B extends A
{
public void show()
{
  System.out.println("in B show");
}
}


public class Hello 
{
  public static void main(String [] args)
  {
B obj = new B();
obj.show();
obj.config();
  }
}