package package1;

public class Dog extends Animal implements IRunning {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在用四条腿跑");
    }
}
