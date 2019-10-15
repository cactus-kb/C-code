public class LinkSearch {
    public static void main(String[] args) {
        int[] arr = new int[] {2,4,5,6,7,3,9};
        int tofind = 5;
        int index = -1;
        for (int i = 0;i < arr.length; i++) {
            if (arr[i] == tofind) {
                index = i;
                break;
            }
        }
        System.out.println("index: " + index);
    }
}
