class Laptop
{
String model;
int price;

public String toString()
{
  return model + " : " + price;

}

public boolean equals(Laptop that)
{
if(this.model.equals(that.model) && this.price == that.price)
{
  return true;
}
else 
{
  return false;
}
}

}



class Hello 
{
  public static void main(String[] args) 
  {
    Laptop obj = new Laptop();
    obj.model = "lenove 90";
    obj.price = 40000;

    Laptop obj1 = new Laptop();
    obj1.model = "lenove 90";
    obj1.price = 40000;

    boolean result = obj.equals(obj1);

    System.out.println(result);
  }
}