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
public class Page40_IsMercurial_taugh {

    public static void main(String[] args) {
        System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println(isMercurial(new int[]{5, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 16, 2, 2}));
        System.out.println(isMercurial(new int[]{3, 2, 18, 1, 0, 3, -11, 1, 3}));
        System.out.println(isMercurial(new int[]{2, 3, 1, 1, 18}));
        System.out.println(isMercurial(new int[]{8, 2, 1, 1, 18, 3, 5}));
        System.out.println(isMercurial(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println(isMercurial(new int[]{1}));
        System.out.println(isMercurial(new int[]{}));
    }

    static int isMercurial(int[] a) {
        int oneCount = 0, countThree = 0;
        for (int val : a) {
            if (val == 1) {
                ++oneCount;
            } else {
                if (oneCount == 1 && val == 3) {
                    ++countThree;
                }
            }
        }
        if (oneCount >= 2 && countThree == 1) {
            return 0;
        }
        return 1;
    }

    static int isMercurial1(int[] a) {
        boolean flugForFirstOne = false, flugForThree = false, flugForLastOne = false;
        for (int val : a) {
            if (flugForFirstOne == false && flugForThree == false && flugForLastOne == false && val == 1) {
                flugForFirstOne = true;
                continue;
            }
            if (flugForThree == false && flugForFirstOne == true && flugForLastOne == false && val == 3) {
                flugForThree = true;
                continue;
            }
            if (flugForLastOne == false && flugForFirstOne == true && flugForThree == true && val == 1) {
                flugForLastOne = true;
            }
        }
        if (flugForFirstOne == true && flugForThree == true && flugForLastOne == true) {
            return 0;
        }
        return 1;
    }

}
