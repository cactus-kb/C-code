public class Test {
    public static void main(String[] args){
        SeqList jj = new SeqList();
        jj.add(0,1);
        jj.add(1,2);
        jj.add(2,3);
        jj.add(3,4);
        jj.add(4,5);
        jj.add(2,8);
        jj.display();

        boolean ret = jj.contains(6);
        System.out.println(ret);

        int ret1 = jj.search(5);
        System.out.println(ret1);

        int ret2 = jj.getpos(2);
        System.out.println(ret2);
        int ret3 = jj.getpos(6);
        System.out.println(ret3);

        jj.setpos(2,99);
        jj.display();

        jj.remove(99);
        jj.display();

        int ret4 = jj.size();
        System.out.println(ret4);

        jj.clear();
        jj.display();
    }
}
