public class day3 {
    public static void main(String[] args){
        th jj = new th();
        jj.add(0,1);
        jj.add(1,2);
        jj.add(2,3);
        jj.add(3,4);
        jj.add(1,8);
        jj.display();

        boolean result = jj.contains(2);
        System.out.println(result);

        int result1 = jj.search(8);
        System.out.println(result1);

        int result2 = jj.getpos(1);
        System.out.println(result2);

        jj.remove(3);
        jj.display();

        int result3 = jj.size();
        System.out.println(result3);

        jj.clear();
        jj.display();
    }
}
