/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_exceptions;

/**
 *
 * @author fabiodemo
 */
public class JavaExceptionError1 {
    public static void main(String[] args) {
        System.out.println("Primeira Linha: ");
        System.out.println("Segunda Linha: ");
        System.out.println("Terceira Linha: ");
        try {
            int[] intArray = new int[]{1, 2, 3};
            MyPrintArray(intArray);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("O array nao possui 4 elementos!");
        }
        System.out.println("Quarta Linha: ");
        System.out.println("Quinta Linha: ");        
    }
    private static void MyPrintArray(int[] arr){
        System.out.println(arr[3]);
        System.out.println("Quatro elementos exibidos!");
    }
}
