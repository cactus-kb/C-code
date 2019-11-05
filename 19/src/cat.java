import package1.Animal;

public class cat extends Animal{
    public cat(String name,int age) {
        super(name,age);
    }

    public void eat(String food) {
        System.out.println(this.name + "正在吃");
    }
}
