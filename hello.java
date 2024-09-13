
class A 
{
  public void show()
  {
    System.out.println("in show method");
  }
  public A()
  {
    System.out.println("object created");
  }
}


class Hello
{
  public static void main(String[] args) 
  {
    new A(); // anonymous object
  new A().show();
   
  }
}