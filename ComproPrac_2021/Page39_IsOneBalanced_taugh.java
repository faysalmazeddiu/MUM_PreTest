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
public class Page39_IsOneBalanced_taugh {

    public static void main(String[] args) {
        System.out.println(isOneBalance(new int[]{1, 1, 1, 2, 3, -18, 45, 1}));
        System.out.println(isOneBalance(new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0}));
        System.out.println(isOneBalance(new int[]{1, 1, 2, 3, 1, -18, 26, 1}));
        System.out.println(isOneBalance(new int[]{}));
        System.out.println(isOneBalance(new int[]{3, 4, 1, 1}));
        System.out.println(isOneBalance(new int[]{1, 1, 3, 4}));
        System.out.println(isOneBalance(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println(isOneBalance(new int[]{1, 1, 1, 1, 1, 1}));
    }

    static int isOneBalance(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        int firstSequenceOne = 0, firstOne = 0;
        int nonOneSequence = 0, nonOne = 0;
        int lastSequenceOne = 0, lastOne = 0;
        for (int i = 0; i < a.length; ++i) {
            if ((firstSequenceOne == 1 && lastSequenceOne == 1 && a[i] == 1) || (nonOneSequence == 1 && a[i] != 1)) {
                return 0;
            }
            if (firstSequenceOne == 0 && a[i] == 1) {
                ++firstOne;
                continue;
            }
            if (firstSequenceOne == 0 && firstOne >= 0) {
                ++firstSequenceOne;
            }
            if (firstSequenceOne == 1 && a[i] != 1) {
                ++nonOne;
                continue;
            }
            if (nonOneSequence == 0 && nonOne >= 0) {
                ++nonOneSequence;
            }
            if (firstSequenceOne == 1 && nonOneSequence == 1 && a[i] == 1) {
                ++lastOne;
                continue;
            }
            if (lastSequenceOne == 0 && lastOne >= 0) {
                ++lastSequenceOne;
            }

        }
        if (a.length == firstOne || a.length == nonOne || a.length == lastOne) {
            return 0;
        }
        return 1;
    }

}
