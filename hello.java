class Hello {
  public static void main(String[] args) {
    int x = 91;
int result = 0;
// check odd or even
// if (x%2==0) {
//   result = 10;
// } else {
//   result = 20;
// }
result = x%2==0 ? 10 : 20;
System.out.println(result);

  }
}