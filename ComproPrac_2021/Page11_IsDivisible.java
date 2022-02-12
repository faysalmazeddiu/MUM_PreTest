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
public class Page11_IsDivisible {
    
    public static void main(String[] args){
        System.out.println(isDevisable(new int[]{3, 3, 6, 36},3));
        System.out.println(isDevisable(new int[]{4},2));
        System.out.println(isDevisable(new int[]{3, 4, 3, 6, 36},3));
        System.out.println(isDevisable(new int[]{6, 12, 24, 36},12));
        System.out.println(isDevisable(new int[]{},12));
    }
    static int isDevisable(int[] a,int devisor){
       for(int val:a){
           if(val%devisor!=0)
               return 0;
       } 
       return 1;
    }
    
}
