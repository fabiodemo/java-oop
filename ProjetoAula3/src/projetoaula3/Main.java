/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoaula3;

import java.util.Arrays;

/**
 *
 * @author fabiodemo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i = 0;
       int[] v1= new int[]{4,8,1,9};
       int[] v2= new int[]{2,5,7,3};
       int tam = v1.length + v2.length;
       int c[]=new int[tam];
       for(; i < v1.length; i++){
           c[i] = v1[i];
       }
       for(int j = 0; j < v2.length; j++, i++){
           c[i] = v2[j];
        }
       System.out.println("Vetor 1: "+Arrays.toString(v1));
       System.out.println("Vetor 2: "+Arrays.toString(v2));
       System.out.println("Resultado da concatenação dos dois vetores: "+Arrays.toString(c));
}
}

