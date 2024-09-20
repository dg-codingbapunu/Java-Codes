@FunctionalInterface
interface A 
{
  public int add(int j, int k);
 
}


class Hello
{
    public static void main(String[] args) 
    {
      
        A obj = (j, k) -> j+k;
       
      int result = obj.add(3, 4);

      System.out.println(result);
       
    }
}