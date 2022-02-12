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
public class Page12_IsSquare {
    
    public static void main(String[] args){
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
    }
    
    static int isSquare(int n){
        int i=0;
        while(i<=n){
            if(i*i==n)
                return 1;
            ++i;
        }
        return 0;
    }
    
}
