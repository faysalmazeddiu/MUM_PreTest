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
public class Page31_IsCubePowerful {
    
    public static void main(String[] args){
        System.out.println(isCubePowerful(153));
        System.out.println(isCubePowerful(370));
        System.out.println(isCubePowerful(371));
        System.out.println(isCubePowerful(407));
        System.out.println(isCubePowerful(87));
        System.out.println(isCubePowerful(0));
        System.out.println(isCubePowerful(-81));
    }
    
    static int isCubePowerful(int n){
        if(n<=0) return 0;
        int sum=0;
        for(int j=n;j!=0;j/=10){
            int rem=j%10;
            sum+=rem*rem*rem;
        }
        if(sum!=n) return 0;
        return 1;
                
    }
    
    static int isCubePowerful11(int n){
        if(n<=0) return 0;
        int temp=n;
        int sum=0;
        while(temp!=0){
            int rem=temp%10;
            sum=sum+rem*rem*rem;
            temp/=10;
        }
        if(sum!=n) return 0;
        return 1;
    }
    
}
