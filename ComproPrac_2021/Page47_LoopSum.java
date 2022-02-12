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
public class Page47_LoopSum {
    
    public static void main(String[] args){
        System.out.println(loopSum(new int[]{1, 2, 3},2));
        System.out.println(loopSum(new int[]{-1, 2, -1},7));
        System.out.println(loopSum(new int[]{1, 4, 5, 6},4));
        System.out.println(loopSum(new int[]{3},10));
    }
    static int loopSum(int[] a, int n){
        int sum=0;
        if(a.length>=n){
            for(int i=0;i<n;++i){
                sum+=a[i];
            }
            
        }else{
            int index=1;
            while(true){ //7
                for(int j=0;j<a.length && index<=n;++j,++index){
                    sum+=a[j];
                }
                if(index>n) break;
            }
            
        }
        return sum;
    }
    
}
