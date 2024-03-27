/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercíciosaula6;
import java.util.Scanner;

/**
 *
 * @author fabiodemo
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo circ = new Circulo();
        System.out.print("Digite o raio do circulo: ");
        circ.setRaio(sc.nextDouble());
        System.out.println("O circulo com raio "+circ.getRaio()+" possui area de: "+circ.getArea(circ.getRaio()));
    }
    
}
