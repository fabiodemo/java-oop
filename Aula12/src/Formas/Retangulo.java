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
public class Retangulo extends Forma {
    double l, a;
    
    public Retangulo(int n) {
        super(n);
    }
    
    @Override
    public double Area(){
        return this.l * this.a;
    }
    
}
