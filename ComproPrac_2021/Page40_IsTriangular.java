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
public class Page40_IsTriangular {
    public static void main(String[] args){
        System.out.println(isTriangular(15));
        System.out.println(isTriangular(14));
        System.out.println(isTriangular(13));
        System.out.println(isTriangular(12));
        System.out.println(isTriangular(11));
        System.out.println(isTriangular(10));
        System.out.println(isTriangular(6));
        System.out.println(isTriangular(3));
        System.out.println(isTriangular(1));
    }
    
    static int isTriangular(int n){
        int sum=0;
        for(int j=1;j<=n;++j){
            sum+=j;
            if(sum==n)
                return 1;
        }
        return 0;
    }
}

