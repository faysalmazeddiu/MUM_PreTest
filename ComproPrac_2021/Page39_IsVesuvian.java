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
public class Page39_IsVesuvian {

    public static void main(String[] args) {
        System.out.println(isVesuvian(13));
        System.out.println(isVesuvian(34));
        System.out.println(isVesuvian(33));

        System.out.println(isVesuvian(50));
        System.out.println(isVesuvian(85));
        System.out.println(isVesuvian(65));
    }
    
    static int isVesuvian(int n){
        int count=0;
        for(int i=1;i<n;++i){
            for(int j=(n-i);j>=i;j--){
                if((i*i)+(j*j)==n){
                    //System.out.println((i)+"----"+(j));
                    //System.out.println((i*i)+"----"+(j*j));
                    ++count;
                    break;
                }
            }
            
            if(count==2){
                return 1;
            }
        }
        return 0;
    }

    static int isVesuvian1(int n) {
        int temp=n;
        int count = 0;
        for (int i = 1; i < temp; ++i) {
            temp=n - i;
            int firstNumber = (int) Math.sqrt(i);
            int secondNumber = (int) Math.sqrt(temp);
            if (firstNumber * firstNumber != i || secondNumber * secondNumber != temp) {
                continue;
            }
            if ((firstNumber * firstNumber) + (secondNumber * secondNumber) == n) {
                ++count;
            }
            if (count == 2) {
                return 1;
            }
        }
        return 0;
    }

   

}
