public class unique {
    public static void main(String[] args) {
        int []ar={4,5,6,7,7,5,10,8};
        for(int i=0;i<ar.length;i++){
            int count=0;
            for(int j=0;j<ar.length;j++){
                if(ar[i]==ar[j]){
              count++;

                }
            }
            if(count==1){
                System.out.println(ar[i]);
            }
        }
    }
}
