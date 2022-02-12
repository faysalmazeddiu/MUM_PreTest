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
public class Page60_IsBalanced {
    
    public static void main(String[] args){
        System.out.println(isBalanced(new int[]{-2,3,2,-3}));
        System.out.println(isBalanced(new int[]{-2,2,2,2}));
        System.out.println(isBalanced(new int[]{-5,2,-2}));
    }
    
    static int isBalanced(int[] a){
        for(int val:a){
            val=(-1)*val;
            boolean flug=false;
            for(int value:a){
                if(value==val){
                    flug=true;
                    break;
                }
            }
            if(!flug) return 0;
        }
        return 1;
    }
    
}
