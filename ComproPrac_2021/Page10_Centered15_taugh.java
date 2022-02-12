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
public class Page10_Centered15_taugh {
    
    public static void main(String[] args){
        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9}));
        System.out.println(isCentered15(new int[]{2, 10, 4, 1, 6, 9}));
        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6}));
        System.out.println(isCentered15(new int[]{1, 1, 8, 3, 1, 1}));
        System.out.println(isCentered15(new int[]{9, 15, 6}));
        System.out.println(isCentered15(new int[]{1, 1, 2, 2, 1, 1}));
        System.out.println(isCentered15(new int[]{1, 1, 15, -1, -1}));
    }
    
    static int isCentered15(int[] a){
        int lower=0;
        int upper=0;
        int isCentred15=0;
        if(a.length%2==0){
            //mid=startIndex+(endIndex-startIndex)/2;
            lower=0+((a.length-1)-0)/2;
            upper=lower+1;
        }else{
            lower=0+((a.length-1)-0)/2;
            
            upper=lower;
        }
       
        while(lower>=0 && upper<a.length){
            int sum=0;
            for(int index=lower;index<=upper;++index){
                sum=sum+a[index];
            }
            if(sum==15){
                isCentred15=1;
                break;
            }
            --lower;
            ++upper;
        }
        return isCentred15;
    }
    
}
