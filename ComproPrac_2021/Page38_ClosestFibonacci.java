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
public class Page38_ClosestFibonacci {
    
    public static void main(String[] args){
        System.out.println(closestFibonacci(33));
        System.out.println(closestFibonacci(34));
        System.out.println(closestFibonacci(13));
//        closestFibonacci(13);
////        closestFibonacci(34);
////        closestFibonacci(33);
    }
    
    static int closestFibonacci(int n) {
        int fibonacci = 1;
        if (n == 1 || n == 2) {
            fibonacci = 1;
        }
        int fibo1 = 1;
        int fibo2 = 1;
        for (int i = 3; i <= n; i++) {
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            if (fibonacci > n) return fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }

        return 0;
    }
    
    static int closestFibonacci1(int n){
        int firstNumber=1;
        int secondNumber=1;
        int result=0;
        int closestFibonacci=0;
        for(int i=2;i<n;i++){
            if(closestFibonacci<=n){
                closestFibonacci=result;
            }
            result=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=result;
            if(result>n){
                break;
            }
            
            
        }
        return closestFibonacci;
    }
    
    static int closestFibonacci2(int n){
        int first=0;
        int second=0;
        int result=0;
        int closestFibonacci=0;
        for(int i=0;i<n;++i){
            if(closestFibonacci<=n){
                closestFibonacci=result;
            }
            if(i<=1){
                first=0;
                second=1;
                result=first+second;
                closestFibonacci=result;
            }else{
                first=second;
                second=result;
                result=first+second;
            }
            if(result>n){
                break;
            }
        }
        return closestFibonacci;
    }
    
}
