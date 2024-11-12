import java.util.Stack;

public class Hello {

    public static void main(String[] args) {
        
      
     Stack <String> animal = new Stack<>();
     animal.push("lion");  
     animal.push("horse");   
     animal.push("tiger");   
     animal.push("elephant");   
 
    
// System.out.println("stack:" +  animal);

System.out.println(animal.peek());
animal.pop();
animal.pop();

System.out.println(animal.peek());

System.out.println("stack:" +  animal);

    }
}