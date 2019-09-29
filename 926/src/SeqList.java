//import java.util.Arrays;

public class SeqList {
    private int[] data = new int[10];
    private int size = 0;

    public void display(){
       // System.out.println(Arrays.toString(data));
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);
            if (i != size - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void add (int pos, int elem) {
        if (pos < 0 || pos > size){
            return;
        }
        if (pos >= data.length){
            realloc();
        }
        if (pos == size) {
            data[pos] = elem;
            size++;
        }
        else {
            for (int i = size; i > pos; i--){
                data[i] = data[i - 1];
            }
            data[pos] = elem;
            size++;
        }
    }
    private void realloc(){
        int[] newdata = new int[this.data.length * 2];
        for (int i = 0; i < this.data.length; i++) {
            newdata[i] = data[i];
        }
        this.data = newdata;
    }

    public boolean contains(int tofind){
        for (int i = 0; i < this.size; i++){
            if (this.data[i] == tofind){
                return true;
            }
        }
        return false;
    }

    public int search(int tofind){
        for (int i = 0; i < this.size; i++){
            if (this.data[i] == tofind){
                return i;
            }
        }
        return -1;
    }

    public int getpos(int pos){
        for (int i = 0; i < this.size; i++){
            if (i == pos){
                return this.data[i];
            }
        }
        return -1;
    }

    public void setpos(int pos,int value) {
        for (int i = 0; i < this.size; i++){
            if (i == pos) {
                this.data[i] = value;
            }
        }
    }

    public void remove(int toremove){
        int pos = search(toremove);
        if (pos == -1) {
            return;
        }
        if (pos == this.size - 1){
            this.size--;
            return;
        }
        for (int i = pos; i < this.size - 1; i++){
            this.data[i] = this.data[i + 1];
        }
        this.size--;
    }

    public int size(){
        return this.size;
    }
    public void clear(){
        this.size = 0;
        this.data = new int[10];
    }
}
