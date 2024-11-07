public class MinArray {
    public static int minArray(int[] a) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<a[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 4, 6, 7};
        int index = minArray(arr);
        System.out.println("Min = " +arr[index]);
    }
}
