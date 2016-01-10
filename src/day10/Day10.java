package day10;

import java.util.*;

public class Day10 {

    public static void main(String[] args) {
        /* Enter your code here.*/
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0;i < T;i++){
            int n = sc.nextInt();
            String bi = getBinary(n);
            System.out.println(bi);
        }
        sc.close();
    }
    
    static String getBinary(int n){
        String bin = "";
        while(n != 0){
            int rem = n % 2;
            n = n / 2;
            bin += rem;
        }
        char[] repr = bin.toCharArray();
        char[] repr2 = new char[bin.length()];
        for(int i = repr.length-1, j = 0; i >= 0; i--, j++){
        	repr2[j] = repr[i];
        }
        bin = new String(repr2);
        return bin;
    }
}
