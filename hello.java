
enum Status
{
  Running, Failed, Pending, Success; // named constants
}




public class Hello 
{

  public static void main(String[] args) 
  
  {
    Status [] ss = Status.values();
    
   
   
   for(Status s : ss)
   {
    System.out.println(s);
   }
  }
}