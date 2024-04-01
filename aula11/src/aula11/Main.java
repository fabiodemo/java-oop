/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

import java.util.Scanner;

/**
 *
 * @author fabiodemo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpregadoComissionadoFixo emp = new EmpregadoComissionadoFixo();
        EmpregadoComissionado empc = new EmpregadoComissionado();
        System.out.print("Nome: ");
        emp.setNome(sc.next());
        System.out.print("Sobrenome: ");
        emp.setSobrenome(sc.next());
        System.out.print("Comissao: ");
        emp.setComissao(sc.nextDouble());
        System.out.print("Vendas Brutas: ");
        emp.setVendasBrutas(sc.nextDouble());
        System.out.print("Salario: ");
        emp.setSalarioFixo(sc.nextDouble());
        emp.getAll();
        System.out.print("salario calculado: "+emp.calculaSalario());
    }
    
}
