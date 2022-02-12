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
public class Page34_DecodeArray_taugh {

    public static void main(String[] args) {
        System.out.println(decodeArray(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
        System.out.println(decodeArray(new int[]{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}));
        System.out.println(decodeArray(new int[]{-1, 0, 1}));
        System.out.println(decodeArray(new int[]{0, 1}));
        System.out.println(decodeArray(new int[]{1}));
        System.out.println(decodeArray(new int[]{0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1}));
        System.out.println(decodeArray(new int[]{- 1, 0, 0, 1, 1, 0, 1}));
    }

    static int decodeArray(int[] a) {
        int countZero = 0;
        int countOne = 0;
        String newString = "";
        if(a[0]==1) return 0;
        for (int i = 0; i < a.length; i++) {
            if (countOne == 0 && a[i] == 0) {
                ++countZero;
                continue;
            }
            if (countZero != 0 && a[i] == 1) {
                ++countOne;
                if (countOne > 1) {
                    newString += 0;
                } else if (countOne == 1) {
                    newString += countZero;
                }
                continue;
            }
            if(countZero != 0 && countOne!=0 && a[i] == 0){
                countZero=0;
                countOne=0;
                ++countZero;
            }

        }
        if(a[0]==-1)
            return (-1)*Integer.parseInt(newString);
        return Integer.parseInt(newString);
    }

}
