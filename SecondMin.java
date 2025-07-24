public class SecondMin {
  public static void main(String[] args) {
        int []a={2,4,8,3,9,10,11};
        int min=Integer.MAX_VALUE;
        int Secmin=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
            Secmin=min;
            min=a[i];

            }else if(a[i]<Secmin && a[i]!=min){
                Secmin=a[i];
            }
            
        }
        System.out.println(min);
            System.out.println(Secmin);
    }  
}
