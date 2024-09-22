import java.util.ArrayList;
import java.util.List;

public class Hello
{
  public static void main(String[] args) 
  {

  List <Integer> nums = new ArrayList<>();
  
  nums.add(8);
  nums.add(18);
  nums.add(67);
  nums.add(12);
  nums.add(6);
  nums.add(79);


nums.forEach(p-> System.out.println(p));


// int sum = 0;

// for(int n : nums)
// {

// if(n%2==0)
// {
//   n = n*5;
// sum = sum+n;

// }

// }

//   System.out.println(sum);
    
  }
}