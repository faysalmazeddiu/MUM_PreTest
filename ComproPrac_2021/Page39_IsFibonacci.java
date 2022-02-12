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
public class Page39_IsFibonacci {

    public static void main(String[] args) {
        System.out.println(isFibonacci(34));
       System.out.println(isFibonacci(13));
        System.out.println(isFibonacci(27));
    }

    static int isFibonacci(int n) {
        int firstNumber = 0;
        int secondNumber = 0;
        int result = 0;
        for (int i = 0; result < n; ++i) {
            
            if (i <= 1) {
                firstNumber = 0;
                secondNumber = 1;
                result = firstNumber + secondNumber;
            } else {
                firstNumber = secondNumber;
                secondNumber = result;
                result = firstNumber + secondNumber;
            }
            if (result == n) {
                return 1;
            }
            
            //System.out.println(result);
        }
        return 0;

    }

}
