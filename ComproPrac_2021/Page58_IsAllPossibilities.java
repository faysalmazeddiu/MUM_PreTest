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
public class Page58_IsAllPossibilities {
    public static void main(String[] args){
        System.out.println(isAllPossibilities(new int[]{1, 2, 0, 3} ));
        System.out.println(isAllPossibilities(new int[]{3, 2, 1, 0} ));
        System.out.println(isAllPossibilities(new int[]{1, 2, 4, 3} ));
        System.out.println(isAllPossibilities(new int[]{0, 2, 3} ));
        System.out.println(isAllPossibilities(new int[]{0} ));
        System.out.println(isAllPossibilities(new int[]{} ));
    }
    
    static int isAllPossibilities(int[] a){
        if(a.length==0 || a==null) return 0;
        for(int i=0;i<=a.length-1;++i){
           boolean flug=false;
           for(int val:a){
               if(val==i){
                   flug=true;
                   break;
               }
           }
           if(!flug){
               return 0;
           }
        }
        return 1;
    }
}
