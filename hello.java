class Hello {

public static void main(String[] args) {
  int x = 7;
  int y = 9;
  double a = 7;
  double b = 6;
  // boolean result = x > y || a < b || a >2;
  boolean result = x < y && a > b ;
  System.out.println(!result);
 
}


}