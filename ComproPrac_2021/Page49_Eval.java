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
public class Page49_Eval {
    
    public static void main(String[] args){
        System.out.println(eval(1.0, new int[]{0, 1, 2, 3, 4}));
        System.out.println(eval(3.0, new int[]{3, 2, 1}));
        System.out.println(eval(2.0, new int[]{3, -2, -1}));
        System.out.println(eval(-3.0, new int[]{3, 2, 1}));
        System.out.println(eval(2.0, new int[]{3, 2}));
        System.out.println(eval(2.0, new int[]{4, 0, 9}));
        System.out.println(eval(2.0, new int[]{10}));
        System.out.println(eval(10.0, new int[]{0, 1}));
    }
    
    static double eval(double x,int[] a){
        double sum=0;
        for(int i=a.length-1;i>=0;--i){
            int k=1;
            double product=1;
            while(k<=i){
               product*=x; 
               ++k;
            }
            sum=sum+a[i]*product;
        }
        return sum;
    } 
    
}
