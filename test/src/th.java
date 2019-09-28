//import java.util.Arrays;
public class th {
  //这个数组的最大容量是10，但初始情况下这十个元素并不都是有效元素
  private int[] data = new int[10];
  private int size = 0;//size表示当前数组中有多少个有效元素

  //打印顺序表
  public void display(){
    //System.out.println(Arrays.toString(data));
    System.out.print("[");
    for(int i = 0; i < size; i++){
      System.out.print(data[i]);
      if(i != size - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("]");
  }
  //在pos位置新增元素
  public void add(int pos,int elem){
    //pos == size也允许插入，此时相当于尾插
    if(pos < 0 || pos > size){
      //pos位置无效
      return ;
    }
    if(this.size >= this.data.length){
      //当前容量不够，需要扩容，申请一块更大的空间，把原有数据拷贝过去
      realloc();
    }
    if(pos == size){
      //尾插的情况，直接把新元素放到size的下标的位置上
      data[pos] = elem;
      size++;
      return;
    }
    for(int i = this.size; i > pos; i--){
      this.data[i] = this.data[i -1];
    }
    this.data[pos] = elem;
    this.size++;
  }
  private void realloc(){
    int[] newdata = new int[this.data.length * 2];
    for(int i = 0; i < this.data.length; i++){
      newdata[i] = this.data[i];
    }
    this.data = newdata;
  }

  public boolean contains(int tofind){
    for(int i = 0; i < this.size; i++){
      if(this.data[i] == tofind){
        return true;
      }
    }
    return false;
  }

  public int search(int tofind){
    for(int i = 0; i < this.size; i++){
      if(this.data[i] ==tofind){
        return i;
      }
    }
    return -1;
  }

  public int getpos(int pos){
    for(int i = 0; i < this.size; i++){
      if(i == pos){
        return this.data[i];
      }
    }
    return -1;
  }

  //按值删除，删除第一次出现的值
  public void remove(int toremove){
    int pos = search(toremove);
    if(pos == -1){
      //这个值不存在，不必删除
      return;
    }
    if(pos == this.size - 1){
      //如果是最后一个元素，直接size--即可，size描述了有效元素的个数
      this.size--;
      return;
    }
    for(int i = pos; i < this.size - 1; i++){
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
