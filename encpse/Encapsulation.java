package encpse;


public class Encapsulation {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();  
       
        l1.setPrice(50, true);    
    }
}


class Laptop {
    int ram;
    private int price;

   
    public void setPrice(int price, boolean isAdmin) {
        if (!isAdmin) {
            System.out.println("You can't change the price");
        } else {
            this.price = price;
            System.out.println("Price updated to: " + this.price);
        }
    }
}
