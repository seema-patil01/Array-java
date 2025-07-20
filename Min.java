public class Min {
     public static void main(String[] args) {
        int []a={1,2,3,4,6,8};
        int min=a[0];
        for(int n:a){
            if(n<min)
            min=n;
        }
        System.out.println(min);
    }
}
