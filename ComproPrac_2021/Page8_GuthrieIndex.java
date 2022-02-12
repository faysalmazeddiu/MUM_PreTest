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
public class Page8_GuthrieIndex {
    
    public static void main(String[] args){
        System.out.println(guthrieIndex(7));
        System.out.println(guthrieIndex(1));
        System.out.println(guthrieIndex(2));
        System.out.println(guthrieIndex(3));
        System.out.println(guthrieIndex(4));
        System.out.println(guthrieIndex(42));
    }
    
    static int guthrieIndex(int n){
        int temp=n;
        int i=0;
        while(temp!=1){
            if(temp%2==0)
                temp/=2;
            else
                temp=temp*3+1;
            //System.out.println("====="+temp);
            ++i;
        }
        return i;
    }
    
    
}
