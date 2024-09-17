 abstract class A 
{
  public abstract void  show();
  public abstract void conflig();
 
}

// abstract class use as inner class in anonymous object

class Hello
{
  public static void main(String[] args) 
  {
    A obj = new A()
    {
      public void show()
      {
        System.out.println("in new show");
      }
      public void conflig()
      {
        System.out.println("in new conflig");
      }
    }
    
    ;
    obj.show();
    obj.conflig();
  }
}