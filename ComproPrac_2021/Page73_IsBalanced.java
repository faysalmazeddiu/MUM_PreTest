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
public class Page73_IsBalanced {
    public static void main(String[] args){
        System.out.println(isBalanced(new int[]{2, 3, 6, 7}));
        System.out.println(isBalanced(new int[]{6, 7, 2, 3, 12}));
        System.out.println(isBalanced(new int[]{7, 15, 2, 3}));
        System.out.println(isBalanced(new int[]{16, 6, 2, 3}));
    }
    
    static int isBalanced(int[] a){
        for(int i=0;i<a.length;++i){
            if(i%2==0 && a[i]%2!=0){
                return 0;
            }
            if(i%2 !=0 && a[i]%2 ==0){
                return 0;
            }
        }
        return 1;
    }
}
