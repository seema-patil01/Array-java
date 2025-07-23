public class SecondMax {
    public static void main(String[] args) {
        int []a={2,4,8,3,9,10,11};
        int max=Integer.MIN_VALUE;
        int Secmax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
            Secmax=max;
            max=a[i];

            }else if(a[i]>Secmax && a[i]!=max){
                Secmax=a[i];
            }
            
        }
        System.out.println(max);
            System.out.println(Secmax);
    }
}
