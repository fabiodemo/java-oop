/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author fabiodemo
 */
public class Assalariado extends Empregado {
    private double salario;

    public Assalariado() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public double vencimento (){
        return this.salario;
    }
    
}
