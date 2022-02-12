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
public class Page59_IsFilter {
    public static void main(String[] args){
        System.out.println(isFilter(new int[]{1, 2, 3, 9, 6, 11}));
        System.out.println(isFilter(new int[]{3, 4, 6, 7, 14, 16}));
        System.out.println(isFilter(new int[]{1, 2, 3, 4, 10, 11, 13}));
        System.out.println(isFilter(new int[]{3, 6, 5, 5, 13, 6, 13}));
        System.out.println(isFilter(new int[]{9, 6, 18}));
        System.out.println(isFilter(new int[]{4, 7, 13}));
    }
    static int isFilter(int[]a){
        for(int val:a){
            if(val==9){
                boolean flug=false;
                for(int value:a){
                    if(value==11){
                        flug=true;
                        break;
                    }
                }
                if(flug==false){
                    return 0;
                }
            }else{
                if(val==7){
                    for(int value:a){
                        if(value==13){
                            return 0;
                        }
                    }
                }
            
            }
        }
        return 1;
    }
}
