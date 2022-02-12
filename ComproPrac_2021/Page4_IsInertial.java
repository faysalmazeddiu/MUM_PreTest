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
public class Page4_IsInertial {
    
    public static void main(String[] args){
        //System.out.println(isInertial(new int[]{11, 4, 20, 9, 2, 8}));
        //System.out.println(isInertial(new int[]{12, 11, 4, 9, 2, 3, 10}));
        
        
        System.out.println(isInertial(new int[]{1}));
        System.out.println(isInertial(new int[]{2}));
        System.out.println(isInertial(new int[]{1, 2, 3, 4}));
        System.out.println(isInertial(new int[]{1, 1, 1, 1, 1, 1, 2}));
        System.out.println(isInertial(new int[]{2, 12, 4, 6, 8, 11}));
        System.out.println(isInertial(new int[]{2, 12, 12, 4, 6, 8, 11}));
        System.out.println(isInertial(new int[]{-2, -4, -6, -8, -11}));
        System.out.println(isInertial(new int[]{2, 3, 5, 7}));
        System.out.println(isInertial(new int[]{2, 4, 6, 8, 10}));
    }
    
    static int isInertial(int[] a){
        int oddCount=0;
        boolean isMaxEven=false;
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                ++oddCount;
            }
            if(i==0){
                max=a[i];
            }else{
                if(max<a[i]){
                    max=a[i];
                }
            }
            
        }
        //System.out.println("Max value is ="+max);
        if(max%2==0) isMaxEven=true;
        if(oddCount==0 || isMaxEven==false) return 0;
        for(int val:a){
            if(val%2!=0){
                for(int value: a){
                    if(value!=max && value%2==0){
                        if(value>val) return 0;
                    }
                }
            }
        }
        return 1;
    }
    
}
