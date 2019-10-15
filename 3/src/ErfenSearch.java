public class ErfenSearch {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        int tofind = 11;
        int start = 0;
        int index = -1;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (true) {
            if (arr[mid] == tofind) {
                index = mid;
                break;
            } else {
                if (arr[mid] > tofind) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                mid = (start + end) / 2;
            }
        }
        System.out.println("index: " + index);
    }
}
