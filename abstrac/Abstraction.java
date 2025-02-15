package abstrac;

public class Abstraction {
  
public static void main(String[] args) 
{

  Audi a1 = new Audi();
  a1.price = 908;
  a1.start();

  BMW b1 = new BMW();
  b1.price = 256;
  b1.start();


}
 
}

class Audi extends Car {

 
  void start() {
    System.out.println("Audi is staring");
    
  }

}

class BMW extends Car {

void start() {
  System.out.println("Bmw is strting");
}
}
abstract class Car {
 
  int price;

abstract  void start();


}