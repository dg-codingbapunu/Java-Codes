class A 
{
  public void show()
  {
    System.out.println("In A show");
  }

class B 
{
  public void config()
  {
    System.out.println("in B show");
  }
}

}



public class Hello {

  public static void main(String[] args) 
  {
    A obj = new A();
    obj.show();
  A.B obj1 = obj.new B();
  obj1.config();
    
  }
}