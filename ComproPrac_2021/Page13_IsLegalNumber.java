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
public class Page13_IsLegalNumber {
    
    public static void main(String[] args){
        System.out.println(isLegalNumber(new int[] {3, 2, 1}, 4));
        System.out.println(isLegalNumber(new int[] {3, 7, 1}, 6));
    }
    
    static int isLegalNumber(int[] a,int base){
        for(int index=a.length-1;index>=0;--index){
            if(a[index]<0 || a[index]>base){
                return 0;
            }
        }
        return 1;
    }
    
}
