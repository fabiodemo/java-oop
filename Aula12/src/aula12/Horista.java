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
public class Horista extends Empregado{
    private double precoHora, horasTrabalhadas;

    public Horista() {
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    @Override
    public double vencimento (){
        return this.precoHora * this.horasTrabalhadas;
    } 
    
}

