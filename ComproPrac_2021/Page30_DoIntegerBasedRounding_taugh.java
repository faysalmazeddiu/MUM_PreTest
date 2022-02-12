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
public class Page30_DoIntegerBasedRounding_taugh {
    public static void main(String[] args){
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5},2);
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5},3);
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5},-3);
        doIntegerBasedRounding(new int[]{-1, -2, -3, -4, -5},3);
        doIntegerBasedRounding(new int[]{-18, 1, 2, 3, 4, 5},4);
        
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5},5);
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5},100);
    }
    
    static void doIntegerBasedRounding(int[] a,int n){
        if(n>0){
            for(int k=0;k<a.length;++k){
                if(a[k]>0){
                    for(int i=0;i<(i+1);++i){
                        int prev=n*i;
                        int next=n*(i+1);
                        if(a[k]>=prev && a[k]<=next){
                            if(a[k]-prev<next-a[k]){
                                a[k]=prev;
                            }else if(a[k]-prev>next-a[k]){
                                a[k]=next;
                            }else if(a[k]-prev==next-a[k]){
                                a[k]=next;
                            }
                            break;
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(a));
        }
    
    }
    
    static void doIntegerBasedRounding1(int[] a,int n){
        if(n>0){
            for(int i=0;i<a.length;i++){
                if(a[i]>0){
                    int j=1;
                    while(true){
                        int prev=n*(j-1);
                        int next=n*j;
                        if(a[i]>=prev && a[i]<=next){
                            if(a[i]-prev<next-a[i]){
                                a[i]=prev;
                            }else if(a[i]-prev>next-a[i]){
                                a[i]=next;
                            }else if(a[i]-prev==next-a[i]){
                                a[i]=next;
                            }
                            break;
                        }
                        ++j;
                    }
                
                
                }
            }
        
        
        }
        System.out.println(Arrays.toString(a));
    }
    
}
