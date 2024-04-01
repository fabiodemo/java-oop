/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;
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
        Scanner sc = new Scanner(System.in);
        Assalariado as = new Assalariado();
        Comissionado com = new Comissionado();
        Horista hor = new Horista();
        as.setNome("Assalariado");
        as.setSobrenome("Salgado");        
        as.setCpf("034231");
        System.out.print("Salario: ");
        as.setSalario(sc.nextDouble());
        com.setNome("Comissionado");
        com.setSobrenome("Comissao");        
        com.setCpf("423231");
        System.out.print("Taxa de comissao: ");
        com.setTaxaComissao(sc.nextDouble());
        System.out.print("Total de venda: ");
        com.setTotalVenda(sc.nextDouble());
        hor.setNome("Horista");
        hor.setSobrenome("Dahora");        
        hor.setCpf("643234");
        System.out.print("Horas trabalhadas: ");
        hor.setHorasTrabalhadas(sc.nextDouble());
        System.out.print("Preco hora: ");
        hor.setPrecoHora(sc.nextDouble());
        System.out.println("Assalariado: \nNome: "+as.getNome()+" "+as.getSobrenome()+". CPF: "+as.getCpf()+"\nSalario: "+as.vencimento()+"\n\n");
        System.out.println("Comissionado: \nNome: "+com.getNome()+" "+com.getSobrenome()+". CPF: "+com.getCpf()+"\nComissao: "+com.vencimento()+"\n\n");
        System.out.println("Horista: \nNome: "+hor.getNome()+" "+hor.getSobrenome()+". CPF: "+hor.getCpf()+"\nPagamento por horas trabalhadas: "+hor.vencimento()+"\n\n");
    }
    
}
