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
public class Page71_IsFancy {

    public static void main(String[] args) {
        System.out.println(isFancy(10));
    }

    static int isFancy(int n) {
        int fancy1 = 1;
        int fancy2 = 1;
        if (fancy1 == n || fancy2 == n) {
            return 1;
        } else {
            for (int i = 3; i < n; ++i) {
                int fancy = 3 * fancy2 + 2 * fancy1;
                if (fancy == n) {
                    return 1;
                }
                fancy1 = fancy2;
                fancy2 = fancy;
            }
        }
        return 0;
    }
}
