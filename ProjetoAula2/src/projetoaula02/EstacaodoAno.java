/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoaula02;

/**
 *
 * @author fabiodemo
 */
public class EstacaodoAno {
  public static void main(String[] args) {
    int dia = 26;
    int mes = 9;
    
    if ((mes >= 3 && dia >= 20) && (mes <= 6 && dia <= 21)){
        System.out.println("Primavera");
    }
    else if ((mes >= 6 && dia >= 21) && (mes <= 9 && dia <= 23)){
        System.out.println("Verao");
    }
    else if ((mes >= 9 && dia >= 23) && (mes <= 12 && dia <= 22)){
        System.out.println("Outono");
    }
    else System.out.println("Inverno");
  }
}

