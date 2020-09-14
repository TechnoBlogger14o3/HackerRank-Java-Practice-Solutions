import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        
        /* Enter your code here. Print output to STDOUT. */
        /* Reverse string and compare to original */
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed) ? "Yes" : "No");
        
    }
}



