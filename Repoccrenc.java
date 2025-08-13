import java.util.Arrays; 
public class Repoccrenc {
    
    public static int[] removeElements(int[] a, int k) 
    { 
        int ind = 0; 
        
        for (int i=0; i<a.length; i++) 
            if (a[i] != k) 
                a[ind++] = a[i]; 

        
        return Arrays.copyOf(a, ind); 
    } 
    public static void main(String[] args) 
    { 
        int[] a = { 3, 9, 2, 3, 1, 7, 2, 3, 5 }; 
        int k = 3; 
        a = removeElements(a, k); 
        System.out.println(Arrays.toString(a)); 
    } 
}

