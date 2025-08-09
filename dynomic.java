import java.util.Arrays;
import java.util.Scanner;

public class dynomic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a row size");
        int row=sc.nextInt();
        System.out.println("enter a colonm size");
        int colonm=sc.nextInt();
        int[][]a=new int[row][colonm];
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
