interface A
{
  void show();
  public abstract void run();
}

interface C
{
public void drive();

}


class B implements A,C
{
  public void show()
{
  System.out.println("in A show");
}
public void run()
{
  System.out.println("in run..");
}
public void drive()
{
  System.out.println("im driving..");
}
}


public class Hello {

  public static void main(String[] args) 
  {
    B obj = new B(); // multiple interfaces method can use in one class
    obj.drive(); 
    obj.show();
    obj.run();
  }
}