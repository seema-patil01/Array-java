import java.util.Arrays;

public class Zeroright {
    public static void main(String[] args) {
        int[]a={2,0,4,0,3,9,0,6};
        int[]b=new int[a.length];
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                b[j]=a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
