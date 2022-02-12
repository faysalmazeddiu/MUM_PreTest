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
public class Page47_IsComplete {
    public static void main(String[] args){
        System.out.println(isComplete(new int[]{36, -28}));
        System.out.println(isComplete(new int[]{36, 28}));
        System.out.println(isComplete(new int[]{4}));
        System.out.println(isComplete(new int[]{3, 2, 1, 1, 5, 6}));
        System.out.println(isComplete(new int[]{3, 7, 23, 13, 107, -99, 97, 81}));
    }
    
    static int isComplete(int[] a){
        int evenElement=0,perfectSquare=0,countSumEight=0;
        for(int i=0;i<a.length;++i){
            if(a[i]%2==0){
                ++evenElement;
            }
            if(isSquare(a[i])){
                ++perfectSquare;
            }
            for(int j=i+1;j<a.length;++j){
                if(a[i]!=a[j] && a[i]+a[j]==8){
                    ++countSumEight;
                }
            }
            if(countSumEight>=1 && evenElement>=1 && perfectSquare>=1){
                return 1;
            }
        }
        return 0;
    }
    static boolean isSquare(int n){
        int i=0;
        while(i<n){
            if(i*i==n){
                return true;
            }
            ++i;
        }
        return false;
    }
}
