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
public class Page70_IsTriple {

    public static void main(String[] args) {
        System.out.println(isTriple(new int[] {3, 1, 2, 1, 3, 1, 3, 2, 2}));
        System.out.println(isTriple(new int[] {2, 5, 2, 5, 5, 2, 5}));
        System.out.println(isTriple(new int[] {3, 1, 1, 1}));
    }

    static int isTriple(int[] a) {
        for (int val : a) {
            int count = 0;
            for (int value : a) {
                if (val == value) {
                    ++count;
                }
            }
            if (count != 3) {
                return 0;
            }
        }
        return 1;
    }

}
