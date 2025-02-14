
public class Hello {

    public static void main(String[] args) {
        

        Person p1 = new Person();
        p1.age = 20;
        p1.name = "Bapun";

       
        
    Developer d1 = new Developer();
    d1.age = 32;
    d1.name = "Sagar";

        d1.eat();
       

        System.out.println(p1.name + "  " + p1.age);

       
       
        System.out.println(d1.name + "  " + d1.age);
    
        p1.eat();
        p1.walk();
       d1.walk();
     
    }
}

class Developer extends Person{


    void walk() {
        System.out.println(" Developer " + name +" is Walking ");

    }

}

class Person {
    String name;
    int age;
   

    
    void walk() {
        System.out.println(name +" is Walking ");

    }

    void eat() {
        System.out.println(name + " is Eating ");
    }

   
}





