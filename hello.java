public class Hello {

    public static void main(String[] args) {
        Audi a1 = new Audi();
        a1.start();
        a1.show();
    }
}

class Bmw extends Car {
    @Override
    void start() {
        System.out.println("Bmw start");
    }
}

class Audi extends Car {
    @Override
    void start() {
        System.out.println("audi started");

    }
    void show() {
        System.out.println("hello");
    }
}

abstract class Car {
    int price;
    abstract void start();
}
