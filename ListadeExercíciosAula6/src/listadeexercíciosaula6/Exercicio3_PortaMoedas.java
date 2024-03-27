/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercíciosaula6;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author fabiodemo
 */
public class Exercicio3_PortaMoedas {
    
    public static void main(String[] args){
        Random gerador = new Random();
        int a = 1, pag = 0, cred = 0, test;
        Scanner sc = new Scanner(System.in);
        PortaMoedas PM = new PortaMoedas();
        //Chamada de um metodo que gera uma String alfanumerica aleatoria com tamanho 8
        PM.setAlfaNum(RandomString.getAlphaNumericString(8));
        System.out.println("Codigo alfanumerico do PM: "+PM.getAlfaNum());
        System.out.print("Digite o nome do titular: ");
        PM.setNome(sc.next());
        //Permanece no laco ate que decida-se sair do PM, ao escolher a opcao 5.
        while(a != -1){
            System.out.println("Escolha as opcoes: \n1. Inserir creditos;\n2. Realizar pagamento;\n3. Consultar o saldo;\n4. Numero total de movimentos\n5. Sair");
            a = sc.nextInt();
            switch(a){
                case 1:
                    System.out.print("Digite o valor em reais a ser inserido no PM: ");
                    cred++;
                    PM.setSaldo(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Digite o valor do pagamento: ");
                    test = PM.Pagamento(PM.getSaldo(), sc.nextDouble());
                    if (test == 1) pag++;
                    break;
                case 3:
                    System.out.println("Valor disponivel: "+PM.getSaldo());
                    break;
                case 4:
                    System.out.println("A quantia de operacoes de credito feitas foram: "+cred+"\nE de pagamentos foram: "+pag);
                    break;
                case 5:
                    a = -1;
                    break;
                default:
                    System.out.println("Valor invalido!");
            }
        }
    }
}
