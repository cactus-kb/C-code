package package1;

import java.util.Arrays;

public class Linklist {
    private int[] arr;
    private int usesize;

    public void add(int pos,int data) {
        if (pos < 0 || pos > arr.length) {
            return;
        }
        if (isfull()) {
            this.arr = Arrays.copyOf(this.arr,this.arr.length * 2);
        }
        for (int i = 0; i < this.usesize - 1; i++) {
            this.arr[i + 1] = this.arr[i];
        }
        this.arr[pos] = data;
    }

    private boolean isfull() {
        if (this.usesize == this.arr.length) {
            return true;
        }
        else {
            return false;
        }
    }

    public void display() {
        for (int i = 0; i < this.usesize - 1; i ++) {
            System.out.println(this.arr + " ");
        }
    }
}

