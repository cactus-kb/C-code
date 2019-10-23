package package1;

import java.util.Arrays;

public class display {
}




class MyArrayList {
    //属性
    private int[] elem;
    private int usedSize;
    private final int CAPACITY = 10;
    public MyArrayList() {
        this.elem = new int[CAPACITY];
        this.usedSize = 0;
    }
    //方法
    // 打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    //判断是否满了
    private boolean isFull() {
       /* if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;*/
        return this.usedSize == this.elem.length;
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if(isFull()) {
            //扩容
            this.elem = Arrays.copyOf(
                    this.elem,this.elem.length * 2
            );
            for (int i = this.usedSize - 1; i >= pos; i--) {
                this.elem[i + 1] = this.elem[i];
            }
            //2、插入
            this.elem[pos] = data;
        }
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize - 1; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0;i < elem.length - 1; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        for (int i = 0; i < elem.length - 1; i++) {
            if (elem[i] == elem[pos]) {
                return elem[pos];
            }
        }
        return -1;
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        for (int i = 0; i < elem.length - 1; i++) {
            if (pos < 0 || pos > this.usedSize) {
                return;
            }
            elem[pos] = value;
        }
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        if (toRemove < 0 || toRemove > this.usedSize) {
            return;
        }
        for (int i = this.usedSize; i >= 0; i--) {
            if (i == toRemove) {
                elem[i] = elem[i + 1];
            }
        }
    }
    // 获取顺序表长度
    public int size() { return 0; }
    // 清空顺序表
    public void clear() { }
}