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
public class FInallyBlock {
    
    public static void main(String[] args){
        String frase = null;
        String novaFrase = null;
        //frase = "A frase eh uma frase!";
        try {
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e){
            System.out.println("A frase inicial esta vazia, foi atribuido um valor default! ");
            frase = "Frase vazia";
        }
        finally{
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase antiga: "+frase);
        System.out.println("Frase nova: "+novaFrase);
    }
}
