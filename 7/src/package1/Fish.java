package package1;

public class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在水里游泳");
    }
}
