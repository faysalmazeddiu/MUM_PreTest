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
public class Page68_IsSmart {
    public static void main(String[] args){
        System.out.println(isSmart(11));
        System.out.println(isSmart(22));
        System.out.println(isSmart(8));
    }
    
    static int isSmart(int n){
        int seq=0;
        int j=0;
        for(int i=1;i<=n;++i){
            if(j==0){
                seq=i;
            }else{
                seq+=j;
            }
            if(seq==n){
                return 1;
            }
            ++j;
        }
        
        
        return 0;
    }
}
