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
public class Page54_55_IsZeroBalanced {
    public static void main(String[] args){
         System.out.println(isZeroBalanced(new int[]{1, 2, -2, -1}));
        System.out.println(isZeroBalanced(new int[]{-3, 1, 2, -2, -1, 3}));
        System.out.println(isZeroBalanced(new int[]{3, 4, -2, -3, -2}));
        System.out.println(isZeroBalanced(new int[]{0, 0, 0, 0, 0, 0}));
        System.out.println(isZeroBalanced(new int[]{3, -3, -3}));
        System.out.println(isZeroBalanced(new int[]{3}));
        System.out.println(isZeroBalanced(new int[]{}));
    }
    
    static int isZeroBalanced(int[] a){
        if(a.length==0) return 0;
        int sum=0;
        int findVal=0;
        for(int i=0;i<a.length;++i){
            sum+=a[i];
            findVal=(-1)*a[i];
            boolean flug=false;
            for(int j=0;j<a.length;++j){
                if(i!=j && a[j]==findVal){
                    flug=true;
                    break;
                }
            }
            if(!flug){
                return 0;
            }
        }
        if(sum!=0){
            return 0;
        }
        return 1;
    }
}
