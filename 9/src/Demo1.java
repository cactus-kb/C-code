public class Demo1 {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.name = "haha";
//        person.eat();
//        System.out.println(person.name.length());
//        System.out.println("===================");
//        Person.count++;
//        System.out.println("count:" + Person.count);
//        person.sleep();
//        System.out.println("count:" + Person.count);

        Person person1 = new Person();
        Person.count++;
        System.out.println("count:" + Person.count);
        Person person2 = new Person();
        Person.count++;
        System.out.println("count:" + Person.count);

    }
}

class Person {
    String name;
    int age;
    public static int count;
     public final int SIZE = 12;

    public void eat() {
        System.out.println(name + "吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}
