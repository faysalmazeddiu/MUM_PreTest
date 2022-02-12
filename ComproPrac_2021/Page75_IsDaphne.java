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
public class Page75_IsDaphne {

    public static void main(String[] args) {
        System.out.println(isDaphne(new int[]{4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6}));
        System.out.println(isDaphne(new int[]{2, 4, 6, 8, 6}));
        System.out.println(isDaphne(new int[]{2, 8, 7, 10, -4, 6}));
    }
    
    static int isDaphne(int[] a){
        int firstEven=0,lastEven=0;
        boolean flugForOdd=false;
        for(int i=0;i<a.length;++i){
            if(a[i]%2==0){
                ++firstEven;
            }else{
                flugForOdd=true;
                break;
            }
        }
        
        for(int i=a.length-1;i>=0;--i){
            if(a[i]%2==0){
                ++lastEven;
            }else{
                break;
            }
        }
        
        if(flugForOdd && firstEven>0 && lastEven>0 && firstEven==lastEven){
            return 1;
        }
        return 0;
    }

    static int isDaphne1(int[] a) {
        int firstEven = 0, lastEven = 0, countOdd = 0;
        int k = 0, i = 0;
        for (k = 0; k < a.length; ++k) {
            if (a[k] < 0) {
                a[k] = -1 * (a[k]);
            }
            if (a[k] % 2 == 0) {
                ++firstEven;
            } else {
                ++countOdd;
                break;
            }
        }
        System.out.println("===k==" + k);
        if (firstEven == 0) {
            return 0;
        } else {
            ++k;
        }
        for (i = a.length - 1; i >= 0; --i) {
            if (a[i] < 0) {
                a[i] = -1 * (a[k]);
            }
            if (a[i] % 2 == 0) {
                ++lastEven;
            } else {
                ++countOdd;
                break;
            }
        }
        System.out.println("===I==" + i);
        if (lastEven == 0) {
            return 0;
        } else {
            --i;
        }
       
        if (countOdd == 0 && k<i) {
            
            for (int j = k; j <= i; ++j) {
                if (a[j] < 0) {
                    a[j] = -1 * (a[j]);
                }
                if (a[j] % 2 != 0) {
                    ++countOdd;
                }
            }
        }
        if (countOdd > 0 && firstEven > 0 && lastEven > 0 && (firstEven == lastEven)) {
            return 1;
        }
        return 0;
    }
}
