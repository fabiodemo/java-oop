/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoaula3;

/**
 *
 * @author fabiodemo
 */
public class NewClass {
    public static void main(String[] args) {
        int i = 18;
        int x= 5;
        int a = 0, b = 1, fibo;
        System.out.print(a+", "+b);
        for(; i > 0; i--){
            fibo = a + b;
            a = b;
            b = fibo;
            System.out.print(", "+fibo);
        }
       // for(int j = 1000; j > 0; j-=2){
         //   System.out.println(+j);
        //}
        /*for(int j = 0; j < 10; j++){
            while(true){
                int y= j;
                if(x > y) break;
            }
            System.out.println("after while");
        }*/
    

    }
    
}
