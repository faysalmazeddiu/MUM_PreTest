/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComproPrac_2021;

/**
 *
 * @author faysalmazed
 */
public class Page53_IsConsecutiveFactored_tricky {

    public static void main(String[] args) {
        System.out.println(isConsecutiveFactored(24));
        System.out.println(isConsecutiveFactored(105));
        System.out.println(isConsecutiveFactored(90));
        System.out.println(isConsecutiveFactored(23));
        System.out.println(isConsecutiveFactored(15));
        System.out.println(isConsecutiveFactored(9));
        System.out.println(isConsecutiveFactored(2));
        System.out.println(isConsecutiveFactored(0));
        System.out.println(isConsecutiveFactored(-12));
    }
    
    
    static int isConsecutiveFactored(int n){
        int i=2;
        while(i<n){
            int j=i+1;
            if(n%i==0 && n%j==0){
                return 1;
            }
            ++i;
        }
        return 0;
    }

    static int isConsecutiveFactored1(int n) {
        if (n <= 0) {
            return 0;
        }
        int i = 2;
        int next = 0;
        boolean flug = false;
        while (i < n) {
            if (n % i == 0) {
                if (next != 0) {
                    if (next == i) {
                        flug = true;
                    }
                }
                next = i + 1;
            }
            ++i;
        }
        if(!flug) return 0;
        return 1;
    }

}
