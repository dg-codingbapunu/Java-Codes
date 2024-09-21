// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Hello
{
  public static void main(String[] args) 
  
  {

    Set<Integer> nums = new TreeSet<Integer>();

    nums.add(142);
    nums.add(389);
    nums.add(409);
    nums.add(765);
    nums.add(765);
    // nums.add(7); set does'nt support duplicate value
   
    // for sorted value we can use TreeSet
for(int n : nums)
{
  System.out.println(n);

}

// to know index use List not colllection
  
   

  }
}