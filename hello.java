
public class Hello {

    public static void main(String[] args) {
        

        Person p1 = new Person();
        p1.age = 20;
        p1.name = "Bapun";

        System.out.println(p1.name + "  " + p1.age);


    }
}

class Person {
    String name;
    int age;
}