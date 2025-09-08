 import java.util.Arrays;
public class payrmid {
    public static void main(String[] args) {
        int rows = 6;  
        int[][] pascal = new int[rows][rows];


        for (int i = 0; i < rows; i++) {
            pascal[i][0] = 1;      
            pascal[i][i] = 1;     
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}

       

