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
public class Page71_IsMeera {
    
        public static void main(String[] args){
            System.out.println(isMeera(new int[]{7, 9, 0, 10, 1}));
            System.out.println(isMeera(new int[]{6, 10, 8}));
            
            System.out.println(isMeera(new int[]{7, 6, 1}));
            System.out.println(isMeera(new int[]{9, 10, 0}));
            System.out.println(isMeera(new int[]{1, 1, 0, 8, 0, 9, 9, 1}));
        }
        
        static int isMeera(int[] a){
            int countOne=0,countNine=0;
            for(int i=0;i<a.length;++i){
                if(a[i]==1){
                    ++countOne;
                }
                if(a[i]==9){
                    ++countNine;
                }
            }
            if((countOne>0 && countNine>0) || (countOne==0 && countNine==0)){
                return 1;
            }
            return 0;
        }
    
}
