  
import java.io.*;
import java.util.*;


public class Comman {

    private static void FindCommonElement(String[] arr1,String[] arr2)
    {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    set.add(arr1[i]);
                    break;
                }
            }
        }
      	System.out.println(set.toString());
    }
    public static void main(String[] args)
    {
        String[] arr1 = { "Article", "in", "Geeks", "for", "Geeks" };
        String[] arr2 = { "Geeks", "for", "Geeks" };

        
        FindCommonElement(arr1, arr2);
    }
}

