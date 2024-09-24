// reverse an array

public class Hello {

  public static void main(String[] args) {
    
int arr [] = new int[]{1,2,3,4,5};
int i;

for (i = 0;  i < arr.length; i++)
{
  System.out.print(arr[i]);
}


for (i = arr.length -1; i >=0; i--)
{
  System.out.print(arr[i] + " ");
}
System.out.println();
  }
}
