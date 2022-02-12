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
public class Page13_ConvertToBase10 {
    
    public static void main(String[] args){
        System.out.println(convertToBase10(new int[] {3, 2, 1}, 4));
        
        
        System.out.println(convertToBase10(new int[ ] {1, 0, 1, 1}, 2));
        System.out.println(convertToBase10(new int[ ] {1, 1, 2}, 3));
        
        System.out.println(convertToBase10(new int[ ] {3, 2, 5}, 8));
        System.out.println(convertToBase10(new int[] {3, 7, 1}, 6));
    }
    static int isLegalNumber(int[] a,int base){
        for(int i=a.length-1;i>=0;--i){
            if(a[i]<0 || a[i]>base) return 0;
        }
        return 1;
    }
    static int convertToBase10(int[] a,int base){
        int base_10=0;
        int i=0;
        if(isLegalNumber(a,base)==0){
            return 0;
        }else{
            for(int index=a.length-1;index>=0;--index){
                base_10=(int)(base_10+(a[index]*Math.pow(base,i)));
                ++i;
            }
        }
        
        return base_10;
    }
    
}
