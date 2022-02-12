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
public class Page81_MinDistance {
    public static void main(String[] args){
        System.out.println(minDistance(13013));
         System.out.println(minDistance(8));
    }
    static int minDistance(int n){
        int min=Integer.MAX_VALUE;
        int prev=1;
        for(int i=2;i<n;++i){
            if(n%i==0){
                if(min>(i-prev)){
                    min=i-prev;
                    prev=i;
                }
                
            }
        }
        return min;
    }
    static int minDistance1(int n){
        int nCopy=n;
        int i=1;
        int prev=0;
        int slalest=0;
        int count=0;
        while(i<=nCopy){
            if(nCopy%i==0){
                if(i==1){
                    prev=i;
                }else{
                    if(count==1){
                        slalest=i-prev;
                    }else{
                        if(slalest>(i-prev)){
                            slalest=i-prev;
                        }
                    }
                    
                    prev=i;
                }
                //nCopy/=i;
                //System.out.println("==="+i);
                ++count;
            }
            ++i;
        }
        return slalest;
    }
}
