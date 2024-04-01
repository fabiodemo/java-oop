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
public class Circulo extends Forma {
    double raio;

    public Circulo(int n) {
        super(n);
    }

    public void Circulo(double r) {
        this.raio = r;
    }
    
    @Override
    public double Area() {
        return ((this.raio * this.raio) * 3.142);
    }
}
