
enum Status
{
  Running, Failed, Pending, Success; // named constants
}




public class Hello 
{

  public static void main(String[] args) 
  
  {
   
    Status s = Status.Success;
    if(s == Status.Failed)
    {
      System.out.println("Try Again");
    } else if(s == Status.Pending)
    {
      System.out.println("please Wait");
    } else if (s == Status.Running) 
    {
      System.out.println("All Good");
    } else 
      {
System.out.println("Done");

      }
  }
}