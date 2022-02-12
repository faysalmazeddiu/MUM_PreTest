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
public class Page16_IsIsolated {
    
    public static void main(String[] args){
        System.out.println(isIsolated(2));
        System.out.println(isIsolated(3));
        System.out.println(isIsolated(8));
        System.out.println(isIsolated(9));
        System.out.println(isIsolated(14));
        System.out.println(isIsolated(24));
        System.out.println(isIsolated(28));
        System.out.println(isIsolated(34));
        System.out.println(isIsolated(58));
        System.out.println(isIsolated(63));  
        System.out.println(isIsolated(69)); 
        System.out.println(isIsolated(162)); 
    }
    
    static int isIsolated(int n){
        if(n<1 || n>2097151) return -1;
        int square=0;
        int cube=n*n*n;
        int cubeRem=0,squRem=0;
        while(cube!=0){
            cubeRem=cube%10;
            cube/=10;
            square=n*n;
            while(square!=0){
                squRem=square%10;
                square/=10;
                if(squRem==cubeRem)
                    return 0;
            }
        }
        return 1;
    }
    
}
