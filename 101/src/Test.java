public class Test {
    public static void main(String[] args) {
//        int maxvalue = Integer.MAX_VALUE;
//        System.out.println(maxvalue);
//        int miinvalue = Integer.MIN_VALUE;
//        System.out.println(miinvalue);
//        String str = "result = ";
//        int a = 10;
//        int b = 20;
//        String ret = str + a + b;
//        System.out.println(ret);

//        int num = 10;
//        if (num % 2 == 0) {
//            System.out.println("num is oushu");
//        }
//        else {
//            System.out.println("num is sushu");
//        }

//        int year = 2001;
//        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//            System.out.println(year + " is runnian");
//        }
//        else {
//            System.out.println(year + " is not runnian");
//        }
//        int num = 1;
//        while (num <= 10) {
//            System.out.println(num);
//            num++;
//        }

//        int num;
//        int ret = 0;
//        for (num = 1; num <= 100; num ++) {
//            ret = ret + num;
//        }
//        System.out.println(ret);

//        int num;
//        int ret = 1;
//        for (num = 1; num <= 5; num++) {
//            ret = ret * num;
//        }
//        System.out.println(ret);

        int num;
        int ret = 1;
        int sum = 0;
        for (num = 1; num <= 5; num++) {
            ret = ret * num;
            sum = sum + ret;
        }
        System.out.println(sum);
    }
}
