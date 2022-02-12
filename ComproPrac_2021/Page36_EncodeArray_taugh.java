/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComproPrac_2021;

import java.util.Arrays;

/**
 *
 * @author faysalmazed
 */
public class Page36_EncodeArray_taugh {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeArray(0)));
        System.out.println(Arrays.toString(encodeArray(1)));
        System.out.println(Arrays.toString(encodeArray(-1)));

        System.out.println(Arrays.toString(encodeArray(100001)));
        System.out.println(Arrays.toString(encodeArray(999)));
    }

    static int[] encodeArray1(int n) {
        if (n == 0) {
            return new int[]{1};
        }
        int count = 0;
        int temp = Math.abs(n);
        int arrCapacity = 0;
        while (temp != 0) {
            int rem = temp % 10;
            ++count;
            arrCapacity += rem + 1;
            temp /= 10;
        }
        if (n < 0) {
            ++arrCapacity;
        }
        int[] retArr = new int[arrCapacity];
        temp = Math.abs(n);
        int index = 0;
        while (temp != 0) {
            int rem = temp % 10;
            index = arrCapacity - (rem + 1);
            int j = 1;
            for (int i = arrCapacity - 1; i >= index; --i) {
                if (j == 1) {
                    retArr[i] = 1;
                } else {
                    retArr[i] = 0;
                }
                ++j;
            }
            if (count == 1 && n < 0) {
                retArr[0] = -1;
            }
            arrCapacity = index;
            temp /= 10;
            --count;
        }
        return retArr;
    }

    static int[] encodeArray(int number) {
        if(number==0){
            return new int[]{1};
        }
        int size = 0;
        if (number < 0) {
            ++size;
        }
        for (int temp = Math.abs(number); temp != 0; temp /= 10) {
            int rem = temp % 10;
            if (rem == 0) {
                ++size;
            }
            if (rem != 0) {
                size += rem + 1;
            }
        }
        int[] retArr = new int[size];
        int retArrindex = 0;
        int range = 0;
        //int j = 0;
        int length = retArr.length;
        for (int temp = Math.abs(number); temp != 0; temp /= 10) {
            int rem = temp % 10;
            if (rem == 0) {
                range = length - 1;
            }
            if (rem != 0) {
                range = length - (rem + 1);
            }
            for (int j = range; j < length ; ++j) {
                if (j == length - 1) {
                    retArr[j] = 1;
                } else {
                    retArr[j] = 0;
                }
                ++retArrindex;

            }
            if(number<0 && (length - retArrindex)==1){
                retArr[0]=-1;
            }
            length = length - retArrindex;

        }
        return retArr;

    }

}
