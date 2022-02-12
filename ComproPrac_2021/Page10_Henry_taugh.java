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
public class Page10_Henry_taugh {

    public static void main(String[] args) {
        System.out.println(henry(1, 3));
    }

    static int henry(int i, int j) {
        int positionCount = 0, totalPerfectPactor = 0;
        for (int k = 1; k < (k + 1); k++) {
            int sum = 0;
            for (int l = 1; l < k; ++l) {
                if (k % l == 0) {
                    sum += l;
                }
            }
            if (k == sum) {
                ++positionCount;
                if (positionCount == i) {
                    totalPerfectPactor += sum;
                }
                if (positionCount == j) {
                    totalPerfectPactor += sum;
                    break;
                }
            }

        }
        //System.out.println(totalPerfectPactor);
        return totalPerfectPactor;
    }

    static void findfactor(int i) {
        for (int j = 1; j <= i; ++j) {
            if (i % j == 0) {
                System.out.println(j);
            }
        }
    }

}
