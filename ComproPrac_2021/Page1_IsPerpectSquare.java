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
public class Page1_IsPerpectSquare {
    
    public static void main(String[] args){
        System.out.println(isPerpectSquare(6));
        System.out.println(isPerpectSquare(36));
        System.out.println(isPerpectSquare(0));
         System.out.println(isPerpectSquare(-5));
    }
    
    static int isPerpectSquare(int n){
        int i=0;
        while(i<(i+1)){
            if(i*i>n)
                return i*i;
            ++i;
        }
        return 0;
    }
    
}
