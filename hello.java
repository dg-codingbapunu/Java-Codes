import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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


  Stream<Integer> s1 = nums.stream();

Stream<Integer> s2 = s1.filter(i-> i%2==0);




s2.forEach(j -> System.out.println(j));




// you cant print s1 (stream) then one time it gives us copilation error

    
  }
}