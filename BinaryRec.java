public class BinaryRec {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60};
        System.out.println(isbinary(a, 60, 0, a.length - 1)); 
    }

    public static int isbinary(int[] a, int key, int st, int end) {
        if (st > end) {
            return -1;
        }

        int mid = (st + end) / 2;

        if (key == a[mid]) {
            return mid;
        } else if (key < a[mid]) {
            return isbinary(a, key, st, mid - 1);
        } else {
            return isbinary(a, key, mid + 1, end);
        }
    }
}
