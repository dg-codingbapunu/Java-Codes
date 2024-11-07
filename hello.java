public class Hello implements Car{

    public static void main(String[] args) {
        
        
    }

    @Override
    public void start() {
       System.out.println("inside interfaces");
    }
}

    interface Car {
        void start ();
    }