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
public class Page4_CountSquarePairs {
    
    public static void main(String[] args){
        System.out.println(countSquarePairs(new int[]{11, 5, 4, 20}));
        System.out.println(countSquarePairs(new int[]{9, 0, 2, -5, 7}));
        System.out.println(countSquarePairs(new int[]{9}));
    }
    static int countSquarePairs(int[] a){
        int count=0;
        for(int x=0;x<a.length;++x){
            for(int y=0;y<a.length;++y){
                if(x!=y && a[x]>0 && a[y]>0 && a[x]<a[y] && isPerfectSquare(a[x]+a[y])==1){
                    System.out.println("("+a[x]+","+a[y]+")");
                    ++count;
                }
            }
        }
        return count;
        
    }
    
    static int isPerfectSquare(int n){
        if(n<0) n=(-1)*n;
        int i=1;
        while(i<n){
            if(i*i==n) 
                return 1;
            ++i;
        }
        return 0;
    }
    
}
