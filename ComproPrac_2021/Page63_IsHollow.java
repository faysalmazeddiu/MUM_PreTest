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
public class Page63_IsHollow {

    public static void main(String[] args) {
        System.out.println(isHollow(new int[]{1, 2, 4, 0, 0, 0, 3, 4, 5}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 5}));
        System.out.println(isHollow(new int[]{1, 2, 4, 9, 0, 0, 0, 3, 4, 5}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 3, 4}));
    }

    static int isHollow(int[] a) {
        int pre = 0,preIndex=0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] != 0) {
                ++pre;
                preIndex=i;
            } else {
                break;
            }
        }
        if(pre!=0){
            ++preIndex;
        }
        int post = 0,postIndex=0;
        
        for (int i = a.length - 1; i >= 0; --i) {
            if (a[i] != 0) {
                ++post;
                postIndex=i;
            } else {
                break;
            }
        }
        if(post!=0){
            --postIndex;
        }
        //System.out.println(preIndex+"======="+postIndex);
        int zero = 0;
        for (int j = preIndex; j <= postIndex; ++j) {
            if (a[j] == 0) {
                ++zero;
            } 
        }
        if (pre != post || zero < 3 || (post + pre + zero) != a.length) {
            return 0;
        }
        return 1;
    }

    static int isHollow1(int[] a) {
        int countFirstNonZero = 0, countMidZero = 0, countLastNonZero = 0, countTotalZero = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] == 0) {
                ++countTotalZero;
            }
            if (countMidZero == 0 && countLastNonZero == 0 && a[i] != 0) {
                ++countFirstNonZero;
                continue;
            }
            if (countFirstNonZero > 0 && countLastNonZero == 0 && a[i] == 0) {
                ++countMidZero;
                continue;
            }
            if (countFirstNonZero > 0 && countMidZero > 0 && a[i] != 0) {
                ++countLastNonZero;
            }
        }
        if (countTotalZero < 3 || countFirstNonZero != countLastNonZero || (countFirstNonZero + countMidZero + countLastNonZero) != a.length) {
            return 0;
        }

        return 1;
    }

}
