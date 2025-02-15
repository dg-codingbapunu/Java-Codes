package abstrac;

public class Abstraction implements Car, Person {
  
    public static void main(String[] args) {
      
      Abstraction obj = new Abstraction();
      obj.start();
      obj.walk();

    }

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }
}

interface Car {
    void start();
}

interface Person {
    void walk();
}
