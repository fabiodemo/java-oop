/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercíciosaula6;
import java.util.Scanner;
/**
 *
 * @author fabiodemo
 */
public class Exercicio3_PortaMoedas {
    
    public static void main(String[] args){
        int a = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite: ");
        String alfanum = sc.next();
        System.out.print("Digite: ");
        String nome = sc.next();
        System.out.print("Digite: ");
        double saldo = 0;
    
        while(a != -1){
            System.out.println("Escolha as opcoes: \n1. Inserir creditos;\n2. Realizar pagamento;\n3. Consultar o saldo;\n4. Numero total de movimentos\n5. Sair");
            a = sc.nextInt();
            switch(a){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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
