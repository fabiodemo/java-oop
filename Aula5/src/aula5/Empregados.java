/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

/**
 *
 * @author fabiodemo
 */
public class Empregados {
    int id;
    String nome;
    float salario;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    public float getSalario() {
        return salario;
    }


    Empregados(int id, String nome, float salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    
}
