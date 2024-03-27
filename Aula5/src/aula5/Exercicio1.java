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
public class Exercicio1 {
    public static void main(String args[]){
        Empregados[] vet = new Empregados[5];
        int i = 1;
        for(; i < 4; i++){
            vet[i] = new Empregados(i,"nome", (float) 430.40);
            for(int j = 1; j <= i; j++){
                System.out.println("id: "+vet[j].id+", nome: "+vet[j].nome+", salario: "+vet[j].salario);
                System.out.println("proximo identificador disponivel: "+(i+1)+"\n");
            }
            System.out.println("");
        }
        for(; i < 5; i++){
            vet[i] = new Empregados(i, "novonome", (float) 600.30);
            for(int j = 1; j <= i; j++){
                System.out.println("id: "+vet[j].id+", nome: "+vet[j].nome+", salario: "+vet[j].salario);
            }
        }
        System.out.println("\n  Todos empregados:");
        for(i = 1; i < 5; i++){
            System.out.println("id: "+vet[i].getId()+", nome: "+vet[i].getNome()+", salario: "+vet[i].getSalario());
        }
    }
}
