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
public class Page60_IsEvens {
    
    public static void main(String[] args){
        System.out.println(isEven(3224));
        System.out.println(isEven(2426));
    }
    
    static int isEven(int n){
        for(int i=n;i!=0;i/=10){
            if((i%10)%2!=0){
                return 0;
            }
        }
        return 1;
    }
    
}
