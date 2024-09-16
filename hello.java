  class  Calc 
{
  public final void show()
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
public void show() // to stop methodoverride we use final key word withj method
{
  System.out.println("in sinu show");
}
}


class Hello
{
  public static void main(String[] args) 
  {
AdvCalc obj = new AdvCalc();
obj.show();
obj.add(3, 8);
   
  }
}