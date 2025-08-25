import java.util.Arrays;
import java.util.Scanner;
public class Arrayprint {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the row size");
      int row=sc.nextInt();
      System.out.println("enter the column size");
      int column=sc.nextInt();
      int[][]a=new int[row][column];
      System.out.println("enter the element");
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            a[i][j]=sc.nextInt();
        }
      }  
      for(int[]n:a){
        System.out.println(Arrays.toString(n)+"\n");
      }
    }
}
