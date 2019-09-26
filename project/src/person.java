public class person {
//    private int age = 18;
//    private String name = "张三";
//    private String sex = "男";

//    public void eat() {
//        System.out.println("eat!");
//    }
//    public void show(){
//        System.out.println("my name is " + name + " and i'm " + age);
//    }
//    public person(){
//        this.name = "小红";
//        this.age = 26;
//        this.sex = "女";
//    }
//    public person(String name,int age,String sex){
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }
//    private String name;
//    private String sex;
//    private int age;
//    public person(){
//        this("小凡","女",24);
//    }
//    public person(String name,String sex,int age){
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }

//    private String name;
//    private String sex;
//    private int age;
//    public person(){
//        System.out.println("hahahahhah");
//    }
//    {
//        this.name = "AA";
//        this.age = 29;
//        this.sex = "boy";
//        System.out.println("kkkkkkkk");
//    }
//    public void showing(){
//        System.out.println("name = " + name + ",age = "+ age + ",sex = " + sex);
//    }
//    public int a;
//    public static int b;
//    public static void change(){
//        b = 10;
//    }
//    public String name = "aa";
//    public int age = 22;
//    private String name = "qq";
//    public void show(){
//        System.out.println("my name is " + name);
//    }

//    private String name = "kk";
//    public void setname(String name){
//        this.name = name;
//    }
//    public String getname(){
//        return name;
//    }
//    public void show(){
//        System.out.println("name is " + name);
//    }

    private String name;
    private int age;
    private static int count;

    public person() {
        System.out.println("okkkkkkk");
    }

    {
        this.name = "OO";
        this.age = 26;
        System.out.println("llllll");
    }

    static {
        count = 10;
        System.out.println("i'm static");
    }

    public void show() {

        System.out.println("name is " + name + "age is " + age);
    }
    public void sleep(){
        System.out.println("sleep");
    }
}

