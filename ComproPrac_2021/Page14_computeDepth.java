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
public class Page14_computeDepth {
    public static void main(String[] args){
        System.out.println(computeDepth(42));
        System.out.println(computeDepth(7));
        System.out.println(computeDepth(13));
        System.out.println(computeDepth(25));
    }
    
    static int computeDepth(int n){
        int[] digitArr={0,1,2,3,4,5,6,7,8,9};
        int multiply=0;
        int count=0;
        for(int i=1;i<(i+1);++i){
            count=i;
            multiply=n*i;
            while(multiply!=0){
                int rem=multiply%10;
                for(int j=0;j<digitArr.length;++j){
                    if(digitArr[j]==rem){
                       digitArr[j]=-1;
                       break;
                    }
                }
                multiply/=10;
            }
            boolean flug=true;
            for(int val:digitArr){
                flug=true;
                if(val!=-1){
                    flug=false;
                    break;
                }
            }
            if(flug){
               break;
            }
        }
        return count;
    }
}
