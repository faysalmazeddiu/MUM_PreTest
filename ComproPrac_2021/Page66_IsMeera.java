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
public class Page66_IsMeera {

    public static void main(String[] args) {
         System.out.println(isMeera(6));
         System.out.println(isMeera(30));
         System.out.println(isMeera(21));
    }

    static int isMeera(int n) {
        int cuntFactor = 0;
        int nCopy=n;
        for (int i = 2; i < nCopy; ++i) {
            if (n % i == 0) {
                //System.out.println("===="+i);
                ++cuntFactor;
            }
        }
        if (n % cuntFactor == 0) {
            return 1;
        }
        return 0;
    }

}
