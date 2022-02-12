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
public class Page67_IsContinuousFactored_trickeyQuestion {

    public static void main(String[] args) {
        System.out.println(isContinuousFactored(6));
        System.out.println(isContinuousFactored(60));
        System.out.println(isContinuousFactored(120));
        System.out.println(isContinuousFactored(90));
        System.out.println(isContinuousFactored(99));
        System.out.println(isContinuousFactored(2));
        System.out.println(isContinuousFactored(13));
        System.out.println(isContinuousFactored(121));
    }

    static int isContinuousFactored(int n) {

        for (int i = 2; i < n; ++i) {
            if (n % i == 0 && n % (i + 1) == 0) {
                return 1;
            }
        }
        return 0;
    }

}
