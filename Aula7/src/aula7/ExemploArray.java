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
public class ExemploArray {
    
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
        
        
    }
}
