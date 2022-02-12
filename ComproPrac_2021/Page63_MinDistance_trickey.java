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
public class Page63_MinDistance_trickey {

    public static void main(String[] args) {
        System.out.println(minDistance(13013));
        System.out.println(minDistance(8));
        
    }
    
    static int minDistance(int n){
        int min=Integer.MAX_VALUE;
        int prevFactor=1;
        int j=2;
        while(j<=n){
            if(n%j==0 && min>(j-prevFactor)){
                min=j-prevFactor;
                prevFactor=j;
            }
            ++j;
        }
        return min;
    }

    static int minDistance1(int n) {
        int prev = 0;
        int i = 1;
        int smallesDistence = 0;
        int nCopy=n;
        while (i <= nCopy) {
            if (n % i == 0) {
                if (i == 1) {
                    prev = i;
                } else {
                    if (smallesDistence == 0) {
                        smallesDistence = i - prev;
                    } else {
                        if (smallesDistence > (i - prev)) {
                            smallesDistence = i - prev;
                        }
                    }
                    prev = i;
                }
                nCopy /= i;
            }
            ++i;
        }
        return smallesDistence;
    }
}
