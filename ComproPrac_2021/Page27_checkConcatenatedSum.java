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
public class Page27_checkConcatenatedSum {

    public static void main(String[] args) {
        System.out.println(checkConcatedSum(198, 2));
        System.out.println(checkConcatedSum(198, 3));
        System.out.println(checkConcatedSum(2997, 3));
        System.out.println(checkConcatedSum(2997, 2));
        System.out.println(checkConcatedSum(13332, 4));
        System.out.println(checkConcatedSum(9, 1));

        //checkConcatedSum(2997, 3);
        test();
    }
    
    static int checkConcatedSum(int n,int catlen){
        int totalSum=0;
        for(int i=n; i!=0;i/=10){
            int rem=i%10;
            int sum=0;
            int j=1;
            for(int k=1;k<=catlen;++k){
                sum+=rem*j;
                j*=10;
            }
            totalSum+=sum;
        }
        if(totalSum!=n)
            return 0;
        return 1;
        
    }
    
    // 
    static void test(){
        /*
            int number=8;
            String s="";
            for(int i=1;i<=3;++i){
                s=s.concat(String.valueOf(number));
            }
            System.out.println(Integer.parseInt(s)+2);
        */
        int number=8;
        int sum=0;
        int j=1;
        for(int i=1;i<=3;++i){
            sum=sum+j*number;
            j=j*10;
        }
        System.out.println(sum);
    }
}
