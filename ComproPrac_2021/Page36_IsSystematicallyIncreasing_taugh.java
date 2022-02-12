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
public class Page36_IsSystematicallyIncreasing_taugh {

    public static void main(String[] args) {
        isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 3});
       // System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 3}));

       // System.out.println(isSystematicallyIncreasing(new int[]{1}));
       // System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2}));
//        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3}));
//        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4}));
//        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5}));
//        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}));
    }

    static int isSystematicallyIncreasing1(int[] a) {
        int j = 1;
        int index = 0;
        String str = "";
        while (index < a.length) {
            for (int i = 1; i < (j + 1); ++i) {
                System.out.println("---"+i);
                if (a[index] != i) {
                    return 0;
                }
                ++index;
            }
            ++j;
        }
        return 1;
    }

    
    static int isSystematicallyIncreasing(int[] a) {
        int index=0;
        int j=1;
        while(index<a.length){
            for(int i=1;i<(j+1);++i){
                if(a[index]!=i){
                    return 0;
                }
                ++index;
            }
            ++j;
        }
        return 1;
    }

}
