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
public class Page17_IsVanilla {
    
    public static void main(String[] args){
        System.out.println(isVanilla(new int[]{1}));
        System.out.println(isVanilla(new int[]{1, 1, 11, 1111, 1111111}));
        System.out.println(isVanilla(new int[]{11, 101, 1111, 11111}));
        System.out.println(isVanilla(new int[]{11, 22, 13, 34, 125}));
        System.out.println(isVanilla(new int[]{9, 999, 99999, -9999}));
        System.out.println(isVanilla(new int[]{}));
    }
    
    static int isVanilla(int[] a){
        int temp=0;
        for(int i=0;i<a.length;++i){
            temp=Math.abs(a[i]);
            int j=0;
            int prev=0;
            while(temp!=0){
                int rem=temp%10;
                if(j!=0 && rem!=prev){
                    return 0;
                }
                prev=rem;
                temp/=10;
                ++j;
            }
//            if(k!=0 && prevEle!=a[i]){
//                System.out.println(k+"===="+a[i]);
//                return 0;
//            }
//            prevEle=a[i];
//            ++k;
        }
        return 1;
    }
    
}
