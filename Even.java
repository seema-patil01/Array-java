public class Even {
    public static void main(String[] args) {
        int []a = {1, 2, 4, 6, 8, 9};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {  
                System.out.println(a[i]);
            }
        }
    } 
}
