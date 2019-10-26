 class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(this.name + "正在吃饭");
    }

    public void play() {
        System.out.println(this.name + "正在玩耍");
    }
    public void study() {
        System.out.println(this.name + "正在学习");
    }

    public void show() {
        System.out.println("我的名字是:" + this.name + ",我现在" + this.age + "岁了");
    }
}
