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
public class Page9_RepsEqual {
    
    public static void main(String[] args){
        System.out.println(RepsEqual(new int[]{3, 2, 0, 5, 3},32053));
        System.out.println(RepsEqual(new int[]{3, 2, 0, 5},32053));
        System.out.println(RepsEqual(new int[]{3, 2, 0, 5, 3, 4},32053));
        System.out.println(RepsEqual(new int[]{2, 3, 0, 5, 3},32053));
        System.out.println(RepsEqual(new int[]{9, 3, 1, 1, 2},32053));
        System.out.println(RepsEqual(new int[]{0, 3, 2, 0, 5, 3},32053));
    }
    
     static int RepsEqual(int[] a,int n){
         for(int i=a.length-1;i>=0;--i){
             int rem=n%10;
             n/=10;
             if(a[i]!=rem){
                 return 0;
             }
         }
         if(n !=0){
             return 0;
         }
         return 1;
     }
    
    
    
    
    static int RepsEqual1(int[] a,int n){
        int tempVal=n;
        int i=0;
        int index=0;
        boolean flug=false;
        while(tempVal!=0){
            flug=false;
            int rem=tempVal%10;
            for(index=a.length-i-1;index>=0;){
                if(rem!=a[index]) return 0;
                else {
                    flug=true;
                    break;
                }
            }
            tempVal/=10;
            ++i;
        }
        
        if(index!=0 && String.valueOf(n).length()!=a.length && flug){
            int count=(String.valueOf(n).length()>a.length)?(String.valueOf(n).length()-a.length):(a.length-String.valueOf(n).length());
            if(a[index-count]!=0) return 0;
        }
        return 1;
    }
    
}
