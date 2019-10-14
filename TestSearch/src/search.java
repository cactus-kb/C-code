//public class search {
//    public static void main(String[] args) {
//        //线性查找
//        int[] arr = new int[] {2,3,5,6,8,4,9,0};
//        int toFind = 18;
//        int index = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == toFind) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println("index:" + index);
//    }
//}


//二分查找
public class search{
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        int toFind = 8;
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        int mid = (start + end) / 2;
        while(true) {
            if (arr[mid] == toFind) {
                index = mid;
                break;
            }
            else {
                if (arr[mid] > toFind) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
                mid = (start + end) / 2;
            }
        }
        System.out.println("index:" + index);
    }
}