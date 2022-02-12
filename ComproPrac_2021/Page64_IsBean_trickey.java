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
public class Page64_IsBean_trickey {
    public static void main(String[] args){
        System.out.println(isBean(new int[]{1,2,3,9,6,13}));
        System.out.println(isBean(new int[]{3,4,6,7,13,15}));
        System.out.println(isBean(new int[]{1,2,3,4,10,11,12}));
        System.out.println(isBean(new int[]{3,6,9,5,7,13,6,17}));
        System.out.println(isBean(new int[]{9, 6, 18}));
        System.out.println(isBean(new int[]{4, 7, 16}));
    }
    
    static int isBean(int[] a){
        for(int val:a){
            if(val==9){
                boolean flug=false;
                for(int value:a){
                    if(value==13){
                        flug=true;
                        break;
                    }
                }
                if(!flug) return 0;
                
            }else{
                if(val==7){
                    for(int value:a){
                        if(value==16){
                            return 0;
                        }
                    }
                }
            
            }
        }
        return 1;
    }
}
