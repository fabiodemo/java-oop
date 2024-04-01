/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

/**
 *
 * @author fabiodemo
 */
abstract public class Forma {
    private double medida;
    
    Forma(int n){
        
    }
    
    public double Area(){
        return this.medida;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

}
