/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

/**
 *
 * @author fabiodemo
 */
public class ExemploArray3 {
    
       public static void main(String[] args){
           Object [] elementos = new Object[4];
           elementos[0] = "cachorro";
           elementos[1] = 100;
           elementos[2] = 'c';
           elementos[3] = 1.2;
           for(Object e:elementos)
               System.out.println("Elemento do Array: "+e);
       }
}
