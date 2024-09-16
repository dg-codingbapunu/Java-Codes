 abstract class  Car
{
public  abstract void drive();
public abstract void fly();

public void playMusic()
{
  System.out.println("playing...");
}

}
  abstract class Mercedes extends Car
{
  public void drive()
  {
    System.out.println("Drive..");
  }
}
class Wagnor extends Mercedes 
{
public void fly()
{
  System.out.println("Flying..");
}
}


public class Hello
{
  public static void main(String[] args)  {
  Wagnor obj = new Wagnor();

obj.drive();
obj.playMusic();
obj.fly();
    
  }
}