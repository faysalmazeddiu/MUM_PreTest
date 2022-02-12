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
public class Page1_NUpCount {
    
    public static void main(String[] args){
        int[] nArray={2,3,1,-6,8,-3,-1,2};
        System.out.println(NUpCount(nArray,5));
        int[] nArray2={6,3,1};
        System.out.println(NUpCount(nArray2,6));
        int[] nArray3={1,2,-1,5,3,2,-3};
         System.out.println(NUpCount(nArray3,20));
    }
    
    static int NUpCount1(int[] a,int n){
        int partialSum=0,preSum=0,count=0;
        boolean flug=true;
        for(int i=0;i<a.length;i++){
           partialSum=partialSum+a[i];
           if(partialSum<n){
               flug=true;
           }
           if(partialSum>n && flug){
               ++count;
               flug=false;
           }
           
        }
        return count;
    }
    
    static int NUpCount(int[] a,int n){
        int partialSum=0,preSum=0,count=0;
        for(int i=0;i<a.length;i++){
           partialSum=partialSum+a[i];
           if(partialSum>n && preSum<n){
               ++count;
               preSum=partialSum;
           }else{
               preSum=0;
           }
           
        }
        return count;
    }
    
    
}
