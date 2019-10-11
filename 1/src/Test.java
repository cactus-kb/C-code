public class Test {
    public static void main(String[] args) {
//        int num;
//        for (num = 100; num <= 200; num++) {
//            int i = 2;
//            while (num % i != 0) {
//                i++;
//            }
//            if (i == num) {
//                System.out.println(num);
//            }
//        }


//        int year;
//        for (year = 1000; year <= 2000; year++) {
//            if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)){
//                System.out.println(year);
//            }
//        }


        int i;
        int j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println(" ");
        }
    }
}
