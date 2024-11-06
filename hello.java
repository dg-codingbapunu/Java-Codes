public class Hello {

    public static void main(String[] args) {
        

        Person p1 = new Person();
        p1.age = 90;
        p1.name = "bapunu";
        System.out.println(p1.name + "" + p1.age);

    }
}

class Person {
    String name;
    int age;
    
}