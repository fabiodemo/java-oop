/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercíciosaula6;
//import static java.lang.Math.pow;

/**
 *
 * @author fabiodemo
 */
public class Circulo {
    double raio;

    public Circulo() {

    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }
    
    public double getArea(double raio) {
        return ((raio * raio) * 3.142);
    }
    
}
