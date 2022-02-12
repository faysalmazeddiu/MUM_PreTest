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
public class Page38_AreAnagrams {
    
    public static void main(String[] args){
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'},new char[]{'i', 't', 's'}));
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'},new char[]{'i', 'd', 's'}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'},new char[]{'b', 'i', 't'}));
        System.out.println(areAnagrams(new char[]{'b', 'o', 'g'} ,new char[]{'b', 'o', 'o'}));
        System.out.println(areAnagrams(new char[]{}, new char[]{}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'},new char[]{'b', 'i', 'g'}));
        System.out.println(areAnagrams(new char[]{'p', 'o', 'o', 'l'}, new char[]{'p', 'o', 'l', 'l'}));
    }
    
    static int areAnagrams(char[] a1,char[] a2){
        if(a1==null && a2==null) return 1;
        if(a1.length!=a2.length) return 0;
        for(int val:a1){
            int countCharforA1=0;
            for(int value:a1){
                if(value==val){
                    ++countCharforA1;
                }
            }
            int countCharforA2=0;
            for(int value:a2){
                if(value==val){
                    ++countCharforA2;
                }
            }
            if(countCharforA1!=countCharforA2) return 0;
        }
        return 1;
    }
    
}
