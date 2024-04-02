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
public class Funcionario {
    String nome, cpf;
    double salario;
    
    public Funcionario() {
    }
    
    public void setFunc(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do funcionario: ");
        this.nome = sc.next();
        System.out.print("Digite o cpf do funcionario: ");
        this.cpf = sc.next();
        System.out.print("Digite o salario do funcionaroi: ");
        this.salario = sc.nextDouble();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }
    
    
    
    public double getBonificacao(){
        return this.salario * (0.10);
    }
    
    /*@Override
    public string toString(){
        return "funcionario(" + "nome=" + this.nome + ", cpf=" + this.cpf + ", salario=" + this.salario + ", bonificacao=" + getBonificacao() + ")";
    }*/

}
