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
public class Page32_IsZeroPlentiful {

    public static void main(String[] args) {
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0, 1}));
        System.out.println(isZeroPlentiful(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12, 1}));
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 1}));
        System.out.println(isZeroPlentiful(new int[]{1, 2, 3, 4}));
        System.out.println(isZeroPlentiful(new int[]{1, 0, 0, 0, 2, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{0}));
        System.out.println(isZeroPlentiful(new int[]{}));
    }

    static int isZeroPlentiful(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int zeroCount = 0;
        int coountSequence = 0;
        int index = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == 0) {
                zeroCount = 0;
                index = i;
                while (index<arr.length && arr[index] == 0) {
                    ++zeroCount;
                    ++index;
                }

                if (zeroCount < 4) {
                    return 0;
                }
                ++coountSequence;
                i = index - 1;
            }

        }
        if (coountSequence == 0) {
            return 0;
        }
        return coountSequence;
    }

    static int isZeroPlentiful1(int[] a) {
        int countZero = 0;
        int countSequence = 0;
        int finalCount = 0;
        for (int val : a) {
            if (val == 0) {
                ++countZero;
            }
            if (val == 0) {
                ++countSequence;
                continue;
            }
            if (countSequence != 0 && countSequence < 4) {
                System.out.println("zero consequence less than 4");
                return 0;
            } else if (countSequence != 0 && countSequence >= 4) {
                countSequence = 0;
                ++finalCount;
            }

        }
        if (countZero < 1) {
            System.out.println("zero cunt less than 1");
            return 0;
        }
        return finalCount;
    }

}
