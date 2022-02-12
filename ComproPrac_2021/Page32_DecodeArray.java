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
public class Page32_DecodeArray {
    
    public static void main(String[] args){
        System.out.println(decodeArray(new int[]{0, -3, 0, -4, 0}));
        System.out.println(decodeArray(new int[]{-1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{111, 115, 118, 127, 125}));
        System.out.println(decodeArray(new int[]{1, 1}));
    }
    
    static int decodeArray(int[] a){
        String fullString="";
        for(int i=0;i<a.length-1;++i){
            int twoValueDiff=Math.abs(a[i]-a[i+1]);
            fullString+=String.valueOf(twoValueDiff);
        }
        if(a[0]<0)
            return (-1)*Integer.parseInt(fullString);
        return Integer.parseInt(fullString);
    }
    
}
