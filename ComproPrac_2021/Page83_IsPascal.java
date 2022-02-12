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
public class Page83_IsPascal {
    public static void main(String[] args){
        System.out.println(isPascal(6));
        System.out.println(isPascal(15));
        System.out.println(isPascal(7));
    }
    
    static int isPascal(int n){
        int sum=0;
        for(int j=1;j<=n;j++){
            sum+=j;
            if(sum==n){
                return 1;
            }
        }
        return 0;
    }
}
