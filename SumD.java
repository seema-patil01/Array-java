public class SumD {
    public static void main(String[] args) {
        int [][]a={{1,2,3},{9,2,4},{4,1,3}};
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if((i==j)||(i+j==a.length-1)){
sum=sum+a[i][j];
                }

                }
            }
            System.out.println(sum);
        }
    }

