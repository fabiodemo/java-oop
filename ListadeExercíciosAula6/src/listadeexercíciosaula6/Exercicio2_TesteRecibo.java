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
public class Exercicio2_TesteRecibo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero da peca: ");
        String num = sc.next();
        System.out.print("Digite a descricao da peca: ");
        String desc = sc.next();
        System.out.print("Digite a quantidade: ");
        int quant = sc.nextInt();
        System.out.print("Digite o valor unitario: ");
        double preco = sc.nextDouble();
        Recibo rec = new Recibo(num, desc, quant, preco);
        System.out.println("Peca num: "+rec.getNum()+"\nDescricao da peca: "+rec.getDescr()+"\nValor x Quantidade: "+rec.getPreco()+" x "+rec.getQuant());
        System.out.println("O valor cobrado eh: "+rec.ValorCobrado(rec.getQuant(), rec.getPreco()));
    }
}
