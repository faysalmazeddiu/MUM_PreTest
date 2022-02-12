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
public class Page33_IsDigitIncreasing {

    public static void main(String[] args) {
        System.out.println(isDigitIncreasing(24));
        System.out.println(isDigitIncreasing(7));
        System.out.println(isDigitIncreasing(36));
        System.out.println(isDigitIncreasing(984));
        System.out.println(isDigitIncreasing(7404));
        System.out.println(isDigitIncreasing(35));
    }

    static int isDigitIncreasing(int n) {
        int countDegit = 0;
        int temp = n;
        while (temp != 0) {
            ++countDegit;
            temp /= 10;
        }
        for (int i = 1; i <= 9; i++) {
            int sum = 0;
            int finalSum=0;
            int k = 1;
            for (int j = 1; j <= countDegit; j++) {
                sum = sum + (i * k);
                finalSum+=sum;
                k = k * 10;
            }
            if (finalSum == n) {
                return 1;
            }
        }
        return 0;
    }

}
