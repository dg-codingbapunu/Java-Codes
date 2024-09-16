 final class  Calc 
{
  public void show()
{
  System.out.println("in Bapun show");
}
public void add(int n1, int n2)
{
System.out.println(n1 + n2);
}

}

class AdvCalc extends Calc // make finnal class to stop inheritance of ypur class
{

}



class Hello
{
  public static void main(String[] args) 
  {
Calc obj = new Calc();
obj.show();
obj.add(3, 8);
   
  }
}