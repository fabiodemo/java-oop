/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

import java.util.Arrays;

/**
 *
 * @author fabiodemo
 */
public class ExemploArray2 {
    
    public static void main(String[] args){
        char[] nota ={'E', 'C', 'A', 'D', 'B'};
        for(int i=0; i < nota.length; i++)
            System.out.println("Nota: "+nota[i]);
        Arrays.sort(nota);
        System.out.println("Vetor ordenado: ");
        for(int i=0; i < nota.length; i++)
            System.out.println("Nota: "+nota[i]);
        int v1[] = {2,3,4,5};        
        int v2[] = {2,3,4,5};
        if(Arrays.equals(v1, v2)) System.out.println("Vetores iguais!");
        else System.out.println("Vetores diferentes");
        int v3[] = new int[5];
        Arrays.fill(v3,5);
        System.out.println("Array preenchido!");
        for(int i = 0; i < v3.length; i++)
            System.out.println("Elemento: "+v3[i]);
        int pos = Arrays.binarySearch(nota, 'C');
        System.out.println("O elemento C esta na posicao: "+pos);
        System.arraycopy(v1, 2, v3, 1, 2);
        System.out.println("Novo vetor: ");
        for(int i = 0; i < v3.length; i++)
            System.out.println("Elemento novo: "+v3[i]);
        
    }
}
