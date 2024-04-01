package aula11;

import java.util.Scanner;

/* @author fabiodemo */
public class AgendaContatoMain {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Agenda ag1 = new Agenda();
        System.out.print("Digite o nome da agenda: ");
        ag1.setNome(sc.next());
        ag1.getNome();
        ag1.setC1();
        ag1.ObterInfo();
    }
}
