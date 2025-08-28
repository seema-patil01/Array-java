public class Min2d {
    public static void main(String[] args) {
          int [][]a={{10,20,30},{11,22,33},{80,60,40}};
      int min=a[0][0];
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            if(a[i][j]<min){
                min=a[i][j];
            }
        }
    }
    System.out.println(min);
    }
}
