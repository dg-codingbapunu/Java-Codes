public class Hello {

    public static void main(String[] args) {
        

        Person p1 = new Person();
        p1.age = 90;
        p1.name = "bapunu";
        System.out.println(p1.name + "" + p1.age);

        Person p2 = new Person();
        p2.age = 80;
        p2.name = "patitapabana";
        System.out.println(p2.age + " " + p2.name);
        p1.eat();
        p2.walk(5);


    }
}

class Person {
    String name;
    int age;


    public Person () {
        System.out.println("creacting an object");
    }

    void walk () {
        System.out.println(name + " " +"walk");
    }
    void eat () {
        System.out.println(name +" "+"eat");
    }

    void walk (int stepes) {
        System.out.println(name + " " +"walk" + stepes);
    }
}