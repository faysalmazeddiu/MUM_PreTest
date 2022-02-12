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
public class Page57_CountOnes {
    
    public static void main(String[] args){
        System.out.println(countOnes(9));
        System.out.println(countOnes(5));
        System.out.println(countOnes(15));
    }
    
    static int countOnes(int n){
        int count=0;
        while(n!=0){
            int rem=n%2;
            if(rem==1) ++count;
            n/=2;
        }
        return count;
    }
    
}
