package package1;

public class Duck extends Animal implements IRunning,ISwimming,IFlying {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name + "正在用翅膀飞");
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在用两条腿跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正漂在水上/");
    }
}
