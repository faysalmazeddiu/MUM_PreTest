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
public class Page6_IsGuthrieSequence {

    public static void main(String[] args) {
//        System.out.println(isGuthrieSequence(new int[]{8, 4, 2, 1}));
//        System.out.println(isGuthrieSequence(new int[]{8, 17, 4, 1}));
//        System.out.println(isGuthrieSequence(new int[]{8, 4, 1}));
//        System.out.println(isGuthrieSequence(new int[]{8, 4, 2}));
        // System.out.println(isGuthrieSequence(new int[]{8, 4, 2, 1}));
        // System.out.println("\n");
        createGuthrieSequence(7);
    }

    static int isGuthrieSequence(int[] a) {
        if (a[a.length - 1] != 1) {
            return 0;
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 0) {
                if (a[i + 1] != a[i] / 2) {
                    return 0;
                }
            } else {
                if (a[i + 1] != (a[i] * 3 + 1)) {
                    return 0;
                }
            }
        }
        return 1;

    }


    /*
    static int isGuthrieSequence(int[] a) {
        int seqEle = 0;
        if (a[a.length - 1] != 1) {
            return 0;
        }
        for (int i = 0; i < a.length - 1; ++i) {
            if (a[i] % 2 == 0) {
                seqEle = a[i] / 2;
                if (a[i + 1] != seqEle) {
                    return 0;
                }
            } else {
                seqEle = (a[i] * 3) + 1;
                if (a[i + 1] != seqEle) {
                    return 0;
                }
            }
        }
        return 1;
    }*/
    static void createGuthrieSequence(int n) {
        int temp = n;
        int i = 0;
        while (temp != 1) {
            if (i == 0) {
                System.out.println(temp);
            }
            if (temp % 2 == 0) {
                temp /= 2;
            } else {
                temp = temp * 3 + 1;
            }
            System.out.println(temp);
            ++i;
        }

    }

}
