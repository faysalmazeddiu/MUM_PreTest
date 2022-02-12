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
public class Page57_IsCubePerfect_tricky {

    public static void main(String[] args) {
        System.out.println(isCubePerfect(new int[]{-1, 1, -8, -27, 8}));
        System.out.println(isCubePerfect(new int[]{27, 3}));
        System.out.println(isCubePerfect(new int[]{1, 1, 1, 1}));
        System.out.println(isCubePerfect(new int[]{64}));
        System.out.println(isCubePerfect(new int[]{63}));
        System.out.println(isCubePerfect(new int[]{-1, 0, 1}));
        System.out.println(isCubePerfect(new int[]{}));
        System.out.println(isCubePerfect(new int[]{3, 7, 21, 36}));
    }
    
    
    static int isCubePerfect(int[] a) {
        for(int val:a){
            if(val<0){
                val=(-1)*val;
            }
            int k=0;
            boolean flug=false;
            while(k<=val){
                if(k*k*k==val){
                    flug=true;
                    break;
                }
                ++k;
            }
            if(!flug){
                return 0;
            }
        }
        return 1;
    }

    static int isCubePerfect1(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        int length = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] < 0) {
                a[i] = -1 * a[i];
            }
            int cube = 0;
            boolean flug = false;
            for (int j = 0; j <= a[i]; ++j) {
                cube = j * j * j;
                if (cube == a[i]) {
                    flug = true;
                    break;
                }
            }
            if (!flug) {
                return 0;
            }
        }
        return 1;
    }

}
