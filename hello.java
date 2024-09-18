
class A 
{
  public void show1()
  {
    System.out.println("in A show");
  }
}
class B extends A
{
  @Override
  
  public void show1()
  {
      System.out.println("in B show");
  }
}



public class Hello 
{

  public static void main(String[] args) 
  {
    B obj = new B();

    obj.show1();
  }
  
}