public class Hello implements Car{

    public static void main(String[] args) {
        
        Hello h2 = new Hello();
        h2.start();
        
    }

    @Override
    public void start() {
       System.out.println("inside interfaces");
    }
}

    interface Car {
        void start ();
    }