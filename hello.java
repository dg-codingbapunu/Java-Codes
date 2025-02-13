
public class Hello {

    public static void main(String[] args) {
        

        Person p1 = new Person();
        p1.age = 20;
        p1.name = "Bapun";

        Person p2 = new Person(31,"sinu");
        
    System.out.println(p2.name);

        // System.out.println(p1.name + "  " + p1.age);

        // System.out.println(p2.name + "  " + p2.age);

        p1.walk(6);
        // p2.eat();
        p1.eat();
        // p2.walk();
        System.out.println(Person.count);
    }
}

class Person {
    String name;
    int age;
    static int count;

    public Person() {
        count++;
        System.out.println("Create a object");
    }

    public Person(int age, String name) {
        this();
        this.name = name;
        this.age = age;

    }


    void walk() {
        System.out.println(name +" is Walking ");

    }
    void eat() {
        System.out.println(name + " is Eating ");
    }

    void walk(int steps) {

        System.out.println(name + " is Walked " + steps + " steps ");


    }
}