package user;

import operation.*;

public class Admin extends User {

    public Admin(String name) {
        this.name = name;
        this.operations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("===Hello" + this.name + "欢迎使用===");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示所有的图书");
        System.out.println("0.退出系统");
        System.out.println("==================================");
        System.out.println("请输入你的选择：");
        int choice = scaner.nextInt();
        return choice;

    }
}
