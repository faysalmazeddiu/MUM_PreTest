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
public class Page73_IsNormal {
    public static void main(String[] args){
        System.out.println(isNormal(1));
        System.out.println(isNormal(2));
        System.out.println(isNormal(3));
        System.out.println(isNormal(4));
        System.out.println(isNormal(5));
        System.out.println(isNormal(7));
        System.out.println(isNormal(8));

        System.out.println(isNormal(6));
        System.out.println(isNormal(9));
        System.out.println(isNormal(10));
    }
    
    static int isNormal(int n){
        for(int i=2;i<n;++i){
            if(i%2 !=0 && n%i==0){
                return 0;
            }
        }
        return 1;
    }
}
