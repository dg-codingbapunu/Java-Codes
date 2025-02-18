
import java.util.Stack;

public class Hello {

    public static void main(String[] args) {
        

  Stack <String> animals = new Stack<>();

animals.push("Tiger");
animals.push("Dog");
animals.push("Cat");
animals.push("Horse");

animals.pop();
System.out.println(animals.peek());

System.out.println("Stack: " + animals);


    }

}




