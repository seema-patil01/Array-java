public class Removedup {
    public static void main(String[] args) {
        int []a={1,2,2,3,4,6,6,7,8,8};
        int max=Integer.MAX_VALUE+1;
        for(int i=0;i<a.length;i++){
            if(a[i]==max)
            continue;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
           a[j]=max;
                }
                }
                System.out.println(a[i]);
            }
        }
    }

