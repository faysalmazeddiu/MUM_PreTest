/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComproPrac_2021;

import java.util.Arrays;

/**
 *
 * @author faysalmazed
 */
public class Page20_ClusterCompression {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(clusterCompression(new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{-5, -5, -5, -5, -5})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{8, 8, 6, 6, -2, -2, -2})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{18})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{})));
    }
    
    static int[] clusterCompression(int[] a) {
        int[] arr=new int[a.length];
        int  index=0;
        for(int i=0;i<a.length;++i){
            if(i<a.length-1 && a[i]!=a[i+1]){
                arr[index]=a[i];
                ++index;
            }else{
                if(i==a.length-1){
                     arr[index]=a[i];
                     ++index;
                }
            }
        }
        int[] retArr=new int[index];
        for(int i=0;i<retArr.length;++i){
            retArr[i]=arr[i];
        }
        //System.out.println(index);
        return retArr;
    }
    
    
    
    

    

    static int[] clusterCompression1(int[] a) {
        if(a.length==0) return a;
        int initial = 0;
        int[] arr = new int[a.length];
        int indexCount = 0;
        int count=1;
        for (int i = initial; i < a.length;++i) {
            for (int j = i; j < a.length; ++j) {
                if (a[i] != a[j]) {
                    arr[indexCount] = a[i];
                    ++indexCount;
                    ++count;
                    break;
                }else{
                    arr[indexCount] = a[i];
                    i=j;
                }
                
            }
        }
        System.out.println(count);
        int[] returnArr=new int[count];
        for(int i=0;i<returnArr.length;++i){
            returnArr[i]=arr[i];
        }
        return returnArr;
    }

}
