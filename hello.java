
@FunctionalInterface
interface A 
{
  void show(int i);

 
}


 public class Hello
 {
    public static void main(String[] args) 
    {
   
   A obj = (int i )  -> System.out.println("in show" + " : " + i);
   obj.show(3);   // lambda expression

     
    }
 }
