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
public class Page5_FindPorcupineNumber_taugh {

    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(0));
        System.out.println(findPorcupineNumber(139));
       System.out.println(findPorcupineNumber(138));
    }

    static int findPorcupineNumber(int n) {
        int procupinen = n + 1;
        while (true) {
            if (isPrime(procupinen) == 1) {
                if (procupinen % 10 == 9) {
                    int nextNum = procupinen + 1;
                    while (nextNum < (nextNum + 1)) {
                        if (isPrime(nextNum) == 1) {
                            if(nextNum % 10==9){
                                return procupinen;
                            }else{
                                procupinen=nextNum;
                                break;
                            }
                        }
                        ++nextNum;
                    }
                }

            }
            ++procupinen;
        }
    }

    static int isPrime(int n) {
        if (n <= 1) {
            return 0;
        }
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;

    }

}
