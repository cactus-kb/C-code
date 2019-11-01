public class Test {
    public static void main(String[] args) {
        int [][]arr = {
        {1,2,8,9},
        {2,4,9,12},
        {4,7,10,13},
        {6,8,11,15}
        };
        int[] ret = findVal(arr,4,4,15);
        System.out.println(ret[0] + " " + ret[1]);
        int h = func(3);
        System.out.println(h);
    }

    public static int[] findVal(int [][] array, int row, int col, int num) {
        int i = 0;
        int j = col - 1;
        int[] arr1 = new int[2];
        while (i < row && j >= 0) {
            if (array[i][j] > num) {
                j--;
            } else if (array[i][j] < num) {
                i++;
            } else {
                arr1[0] = i;
                arr1[1] = j;
                break;
            }
        }
        return arr1;
    }


    //杀人游戏，报3的出局
//    public static int function(int n) {
//        int[] array = new int[n];
//        for (int i =0; i< array.length; i++) {
//            array[i] = 1;
//        }
//        int count = 0;
//        while (n > 1) {
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] == 1) {
//                    count++;
//                }
//                if (count == 3) {
//                    array[i] = 0;
//                    count = 0;
//                    n--;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 1) {
//                return i;
//            }
//        }
//        return -1;
//    }


    public static int func(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        int count = 0;
        while (n > 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    count++;
                }
                if (count == 3) {
                    arr[i] = 0;
                    count = 0;
                    n--;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}
