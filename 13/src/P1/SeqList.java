package P1;

import java.util.Arrays;

class SeqList {
    private int[] elem;
    private int usedSize;
    private final int CAPACITY = 10;

    public SeqList() {
        this.elem = new int[CAPACITY];
        this.usedSize = 0;
    }

    //打印顺序表
    public void display() {
        System.out.print("[");
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]);
            if (i != this.usedSize - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    //在pos位置新增元素
    public void add(int pos, int data) {
        if (pos < 0 || pos > this.usedSize) {
            return;
        }
        if (isFull()) {
            this.elem = Arrays.copyOf(this.elem,this.elem.length * 2);
        }
        for (int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
     //判断是否满了
    private boolean isFull() {
        if (this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }
    //判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if (pos < 0 || pos > this.usedSize){
                return -1;
        }
        return this.elem[pos];
    }

   // 给 pos 位置的元素设为 value
   public void setPos(int pos, int value) {
        if (pos < 0 || pos > this.usedSize) {
            return;
        }
        this.elem[pos] = value;
   }

   //删除第一次出现的关键字key
   public void remove(int toRemove) {
        int index = search(toRemove);
        if (index == -1) {
            return;
        }
        if (index == this.usedSize - 1) {
            this.usedSize--;
            return;
        }
        for (int i = index; i < this.usedSize - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
   }

   // 获取顺序表长度
   public int size() {
        return this.usedSize;
   }

   // 清空顺序表
   public void clear() {
        this.usedSize = 0;
   }
}
