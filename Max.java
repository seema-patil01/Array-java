public class Max {

    public static void main(String[] args) {
        int []a={1,2,3,4,6,8};
        int max=0;
        for(int n:a){
            if(n>max)
            max=n;
        }
        System.out.println(max);
    }
}