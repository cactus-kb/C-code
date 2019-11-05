package package1;

public class Animal {
    public String  name;
    public int age;
    public String sex;

    protected Animal(String name,int age) {
        this.name = name;
        this.age =age;
    }

    public  void eat(String food) {
        System.out.println("i'm a animal");
        System.out.println(this.name + "正在吃" + food);
    }
}
