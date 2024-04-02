/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author fabiodemo
 */
public class ControleDeBonificacoes {
        private double totalDeBonificacoes = 0;
    
    public double getTotalDeBonificacoes(){
        return totalDeBonificacoes;        
    }
    
    public void setTotalDeBonificacoes(Funcionario funcionario){
        this.totalDeBonificacoes += funcionario.getBonificacao();        
    }
}

