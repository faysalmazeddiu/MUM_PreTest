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
public class Page16_IsStacked {
    
    public static void main(String[] args){
        System.out.println(statck(7));
    }
    
    static int statck(int n){
        int sum=0;
        for(int i=1;i<=n;++i){
           sum+=i;
           if(sum==n)
              return 1;
        
        }
        return 0;
    }
    
}
