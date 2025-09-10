import java.util.Arrays;

public class Matrix {
  
    public static void main(String[] args) {
        int [][]a={{1,2,3},{4,5,6},{7,8,9}};
        int[][]b={{2,4,6},{1,3,5},{1,2,3}};
        int[][]c=new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                for(int k=0;k<a.length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int[]n:c){
            System.out.println(Arrays.toString(a));
        }
    }
}
