import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Hello 
{

  public static void main(String[] args) 
  {

    Comparator<Integer> comp = new Comparator<Integer>() 
    
    {

      public int compare(Integer i, Integer j)
     {
     
        if(i%10 > j%10)
        {
          return 1;
        }

         
      else {
        return -1;
      }
       
      
      
     }
      
    };




List<Integer> nums = new ArrayList<>();


nums.add(23);
nums.add(65);
nums.add(71);
nums.add(79);      // samall to big number sorting 

Collections.sort(nums,comp);

System.out.println(nums);
  
  }
  
}