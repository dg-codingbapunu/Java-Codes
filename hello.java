class Calculator {
  int num = 5;
  public int add (int n1 , int n2)
{
return n1 + n2;

}
  
}
 
 
 
 
 
 
 public class Hello 
{

public static void main(String[] args) {
  
Calculator obj = new Calculator();
Calculator obj1 = new Calculator();

// int r1 =obj.add(59, 78);
// System.out.println(r1);
obj1.num = 8;
System.out.println(obj.num);
System.out.println(obj1.num);
}


}