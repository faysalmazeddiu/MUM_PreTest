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
public class Page19_Smallest {

    public static void main(String[] args) {
        System.out.println(smallest(3));
        System.out.println(smallest(4));
        System.out.println(smallest(5));
        System.out.println(smallest(6));
        System.out.println(smallest(7));
    }

    static int smallest(int n) {
        int i = 1;
        while (true) {
            boolean flug2 = true;
            for (int k = 1; k <= n; ++k) {
                int multiply = i * k;
                boolean flug = false;
                for (int temp = multiply; temp != 0; temp /= 10) {
                    //flug = false;  
                    int rem = temp % 10;
                    if (rem == 2) {
                        flug = true;
                        break;
                    }
                }
                if (!flug) {
                    flug2 = false;
                    break;
                }
            }
            if (flug2) {
                return i;
            }
            ++i;
        }
    }

    static int smallest1(int n) {
        //int nunmber=124;
        //int nunmber=624;
        //int nunmber=624;
        //int nunmber=642;
        int nunmber = 4062;
        for (int j = 1; j <= n; ++j) {
            int multiply = nunmber * j;
            System.out.println("====" + multiply);
            boolean flug = false;
            while (multiply != 0) {
                int rem = multiply % 10;
                if (rem == 2) {
                    flug = true;
                    break;
                }
                multiply /= 10;
            }
            if (!flug) {
                return 0;
            }

        }
        return nunmber;

    }

    static int smallest2(int n) {
        int smalle = 0;
        for (int i = 1; i < (i + 1); ++i) {
            int count = 0;
            for (int j = 1; j <= n; ++j) {
                int multiply = i * j;
                boolean flug = false;
                while (multiply != 0) {
                    int rem = multiply % 10;
                    if (rem == 2) {
                        flug = true;
                        break;
                    }
                    multiply /= 10;
                }
                if (!flug) {
                    break;
                }
                ++count;
            }
            if (count == n) {
                smalle = i;
                break;
            }
        }
        return smalle;
    }

}
