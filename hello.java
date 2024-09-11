class Mobile {
    String brands;
 int price;
 static String name;

  public void show() {
    System.out.println(brands + " : " + price + " : " + name);
  }
  public static void show1(Mobile obj) {
    System.out.println(obj.brands + " : " + obj.price + " : " + name);
  }

}



public class Hello {
  public static void main(String[] args) {
Mobile obj1 = new Mobile();
obj1.brands = "Apple";
Mobile.name = "Hand phone";
obj1.price = 100000;

Mobile obj2 = new Mobile();
obj2.brands = "oppo";
Mobile.name = "Smart Phone";
obj2.price = 150000;

Mobile.name = "phone";


obj1.show();
obj2.show();
Mobile.show1(obj1);
  
  }
}