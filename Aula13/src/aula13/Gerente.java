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
public class Gerente extends Funcionario {
    private String senha;
    private int nroFuncionariosGerenciados;

    public Gerente() {
    }
    
    public void setGer(){
        Gerente.super.setFunc();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a senha do gerente: ");
        this.senha = sc.next();
        System.out.print("Digite o numero de funcionarios gerenciados: ");
        this.nroFuncionariosGerenciados = sc.nextInt();
    }

    public String getSenha() {
        return senha;
    }

    public int getNroFuncionariosGerenciados() {
        return nroFuncionariosGerenciados;
    }
    
    
    public boolean autentica (String senha){
        if (this.senha.equals(senha)){
            System.out.println("Acesso permitido! ");
            return true;
        }
        System.out.println("Acesso negado");
        return false;
    }
    
    @Override
    public double getBonificacao(){
        return super.getSalario() * (0.15);
    }
    
}
