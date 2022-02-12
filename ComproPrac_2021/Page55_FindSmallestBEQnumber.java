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
public class Page55_FindSmallestBEQnumber {
    public static void main(String[] args){
        System.out.println(findSmallestBEQnumber());
    }
    
    static int findSmallestBEQnumber(){
        int number=1;
        while(true){
            int cube=number*number*number;
            int count=0;
            while(cube!=0){
                int rem=cube%10;
                if(rem==6){
                    ++count;
                }
                cube/=10;
            }
            if(count==4){
                return number;
            }
            ++number;
        }
    }
    
    
    static int findSmallestBEQnumber1(){
        int beqNumber=0;
        int number=1;
        for(int i=number;i<(i+1);++i){
            int cube=i*i*i;
            //System.out.println(i+"===="+cube);
            int countSix=0;
            while(cube!=0){
                int rem=cube%10;
                if(rem==6){
                    ++countSix;
                }
                cube/=10;
            }
            if(countSix==4){
                 beqNumber=i;
                 break;
            }
        }
        return beqNumber;
    }
}
