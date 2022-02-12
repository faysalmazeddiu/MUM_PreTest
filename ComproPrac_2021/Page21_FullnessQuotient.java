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
public class Page21_FullnessQuotient {

    public static void main(String[] args) {
        System.out.println(fullnessQuotient(1));
        System.out.println(fullnessQuotient(9));
        System.out.println(fullnessQuotient(360));
        System.out.println(fullnessQuotient(-4));
        System.out.println(fullnessQuotient(94));
    }

    static int fullnessQuotient(int n) {
        if (n < 1) {
            return -1;
        }
        int count = 0;
        for (int i = 2; i <= 9; ++i) {
            int temp = n;
            boolean flug = true;
            while (temp >= i) {
                int rem = temp % i;
                if (rem == 0) {
                    flug = false;
                    break;
                }
                temp /= i;
            }
            if (flug) {
                ++count;
            }
        }
        return count;
    }

}
