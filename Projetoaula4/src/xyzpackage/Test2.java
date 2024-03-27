/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyzpackage;
import abcpackage.*;

/**
 *
 * @author fabiodemo
 */
public class Test2 extends Addition2{
    int id;
    float salario;

    public void setId(int id) {
        this.id = id;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public Test2(float salario) {
        this.salario = salario;
    }
    
    public int getId() {
        return id;
    }
    public static void main(String args[]){
        Test2 obj = new Test2();
        System.out.println(obj.addTwoNumbers(11, 22));
    }

    public Test2() {
    }
}
