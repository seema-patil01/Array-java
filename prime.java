public class prime {
    public static void main(String[] args) {
        int [][]a={{1,2},{5,8}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                int count=0;
                for(int k=1;k<=a[i][j];k++){
                    if(a[i][j]%k==0){
                     count++;
                    }
                }
                if(count==2){
                    System.out.println(a[i][j]);
                }
            }
           
        }
        
    }
}
