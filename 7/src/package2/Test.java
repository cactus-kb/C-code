package package2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Arrays.toString(students);
        System.out.println(Arrays.toString(students));
    }

    public static Student[] students = new Student[] {
            new Student("张三",95),
            new Student("李四",96),
            new Student("王二",97),
            new Student("赵六",91),
    };
}
