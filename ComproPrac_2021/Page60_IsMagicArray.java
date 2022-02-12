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
public class Page60_IsMagicArray {

    public static void main(String[] args) {
        System.out.println(isMagicArray(new int[]{21, 3, 7, 9,11,4,6}));
        System.out.println(isMagicArray(new int[]{13, 4, 4, 4, 4}));
        System.out.println(isMagicArray(new int[]{10, 5, 5}));
        System.out.println(isMagicArray(new int[]{0, 6, 8, 20}));
        System.out.println(isMagicArray(new int[]{3}));
        System.out.println(isMagicArray(new int[]{8,5,-5,5,3}));
    }

    static int isMagicArray(int[] a) {
        int countPrime = 0, sum = 0;
        boolean isPrime = true;
        for (int i = 0; i < a.length; ++i) {
            isPrime = true;
            if (a[i] <= 1) {
                isPrime = false;
            }else{
                for(int j=2;j<a[i];++j){
                    if(a[i]%j==0){
                       isPrime = false;
                       break;
                    }
                }
            }
            if(isPrime){
                ++countPrime;
                sum+=a[i];
            }

        }
        if(countPrime==0 && a[0]==0) return 1;
        if(sum==a[0]) return 1;
        return 0;
    }

}
