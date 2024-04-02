/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

import java.util.Scanner;

/**
 *
 * @author fabiodemo
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;
        Funcionario func = new Funcionario();
        Gerente ger = new Gerente();        
        System.out.println("Insira as informacoes do Gerente: ");
        ger.setGer();
        System.out.println("Insira as informacoes do Funcionario: ");
        func.setFunc(); 
        System.out.print("Senha: ");
        senha = sc.next();
        if(ger.autentica(senha))
            System.out.println("Bonificacao do gerente: "+ger.getBonificacao());
        System.out.println("Bonificacao do funcionario: "+func.getBonificacao()); 
    }
    
}
