/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoaula02;
import java.util.Scanner;
/**
 *
 * @author fabiodemo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hello World!");
        /*
        int a = 3;
        int b = 4;
        int c = 6;
        
        if (a > b && c > a)
            System.out.println(c+ " eh maior que " +a+" e maior que "+b);
        else if (a < b)
            System.out.println(a+ " eh menor que " +b);
        else System.out.println(a+ " eh igual " +b);
        //teste chamando um objeto
        Puppy myPuppy = new Puppy( "tommy" );
        */
        /*
        int a = 1;
        
        switch(a){
            case 0: System.out.println("O numero eh: zero");
                break;
            case 1: System.out.println("O numero eh: um");
                break;
            case 2: System.out.println("O numero eh: dois");
                break;
            default: System.out.println("O numero nao pertence ao conjunto {1, 2, 3}");
        }*/
    /*Escreva um programa em java que receba como entrada um dia e um mês qualquer (numérico) e diga qual estação do ano ele pertence
        Primavera: 20 de março a 21 de junho;
        Verão: 21 de junho a 23 de setembro;
        Outono: de 22 ou 23 de stembro a 22 de dezembro;
        Inverno: de 22 de dezembro a 20 de março.*/
    /*
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Informe o numero da matricula: ");
    int mat = sc.nextInt();
    System.out.println("Informe o nome do aluno: ");
    String nome = sc.next();
    System.out.println("Informe a media: ");
    float media = sc.nextFloat();
    System.out.println(nome +"Dados do aluno: " "- Matricula: " +mat "- Media: " +media);
*/
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o nome: ");
    String nomemat;
        nomemat = sc.next();
        System.out.println("Nome: "+nomemat);
    String nome[] = new String[3];
    nome[0] = new String ("João");
    nome[1] = new String ("Maria");
    nome[2] = new String ("Manoel");
        System.out.println(nome[1]);
    }

        
    
}
