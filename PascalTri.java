public class PascalTri {
    public static void main(String[] args) {
        int n = 5;
        int[][] a = new int[n][];
        pascal(a);
        for (int i = 0; i < n; i++) {
          
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
           
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void pascal(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i + 1]; 
            for (int j = 0; j < a[i].length; j++) {
                if (j == 0 || j == i) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                }
            }
        }
    }
}

