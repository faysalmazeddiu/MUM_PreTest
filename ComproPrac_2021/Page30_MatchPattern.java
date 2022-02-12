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
public class Page30_MatchPattern {

    public static void main(String[] args) {
           System.out.println(matchPattern(new int[]{1, 1, 1, 2, 2, 1, 1, 3},new int[]{1, 2, 1, 3}));
           System.out.println(matchPattern(new int[]{1, 1, 1, 1, 1},new int[]{1}));
           System.out.println(matchPattern(new int[]{1},new int[]{1}));
           System.out.println(matchPattern(new int[]{1, 1, 2, 2, 2, 2},new int[]{1, 2}));
           System.out.println(matchPattern(new int[]{1, 2, 3},new int[]{1, 2}));
          
           System.out.println(matchPattern(new int[]{1, 2},new int[]{1, 2, 3}));
           
            System.out.println(matchPattern(new int[]{1, 1, 2, 2, 2, 2, 3},new int[]{1, 3}));
           
           System.out.println(matchPattern(new int[]{1, 1, 1, 1},new int[]{1, 3}));
           System.out.println(matchPattern(new int[]{1, 1, 1, 1, 2, 2, 3, 3},new int[]{1, 2}));
           System.out.println(matchPattern(new int[]{1, 1, 10, 4, 4, 3},new int[]{1, 4, 3}));
    }

    static int matchPattern(int[] a, int[] pattern) {
        int i = 0; // index into a
        int k = 0; // index into pattern
        int matches = 0; // how many times current pattern character has been matched so far
        for (i = 0; i < a.length; i++) {
            if (a[i] == pattern[k]) {
                matches++; // current pattern character was matched
            } else if (matches == 0 || k == pattern.length - 1) {
                System.out.println(a[i]+"====="+k+"=========="+(pattern.length - 1));
                return 0; // if pattern[k] was never matched (matches==0) or at end of pattern (k==patternLen-1)
            } else // advance to next pattern character {
            {
                ++k;
                if(a[i]==pattern[k]){
                    matches++;
                }else{
                    return 0;
                }
            }
        }
        if ((a.length == matches) && (k == pattern.length - 1)) {
            return 1;
        } else {
            return 0;
        }
    }
}
