import java.util.ArrayList;

public class Hello {

    public static void main(String[] args) {
        

        
ArrayList <Integer> list= new ArrayList<>();


   
   list.add(3);
   list.add(90);
   list.add(7);
   list.add(5);
   list.add(4, 1);
   list.add(11);

System.out.println(list.get(2)); // get element
System.out.println(list.remove(3)); // remove element
list.remove(Integer.valueOf(11));
list.clear();
   System.out.println(list);



     
    }
}




