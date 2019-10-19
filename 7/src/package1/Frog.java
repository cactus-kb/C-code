package package1;

public class Frog extends Animal implements IRunning,ISwimming {
    public Frog(String name) {
        super(name);
    }


    @Override
    public void run() {
        System.out.println(this.name + "正在往前跳");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在用蹬腿游泳");
    }
}
