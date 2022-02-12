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
public class Page65_IsMeera {

    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{3, 5, -2}));
        System.out.println(isMeera(new int[]{8, 3, 4}));
    }

    static int isMeera(int[] a) {
        for(int val:a){
            for(int value:a){
                if(val*2==value){
                    return 0;
                }
            }
        }
        return 1;
    }

}
