
@FunctionalInterface
interface A 
{
  void show();

 
}


 public class Hello
 {
    public static void main(String[] args) 
    {
      A obj = new A() {
        
public void show()
{
  System.out.println("in showq");
}

      };

      obj.show();
    }
 }
