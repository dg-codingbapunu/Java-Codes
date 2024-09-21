class Hello
{
    @SuppressWarnings("null")
    public static void main(String[] args)

      {

        int i = 2;
        int j = 0;
        int nums[] = new int[5];
        String str = null;

try 
{
   j = 20/i;
   System.out.println(str.length());
   System.out.println(nums[5]);
}
catch (ArithmeticException e)
{
System.out.println("my fault sorry");
} 
catch (ArrayIndexOutOfBoundsException e)
{
System.out.println("stay in your limit");
}
catch (Exception e)
{
  System.out.println("im the parennt of all exception");
}
      
 System.out.println(j);
      
      }
}