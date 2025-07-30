public class Linarseration {
    public static void main(String[] args) {
        int[]a={3,5,8,9,10,11,14};
        System.out.println(find(a,5));
    }
    public static int find(int[] a,int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;

            }
        }
            return-1;
        
    }
}
