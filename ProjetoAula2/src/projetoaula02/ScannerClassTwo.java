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
public class ScannerClassTwo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Informe o numero da matricula: ");
    int mat = sc.nextInt();
    System.out.println("Informe o nome do aluno: ");
    String nome = sc.next();
    System.out.println("Informe a media: ");
    float media = sc.nextFloat();
    System.out.println("Dados do aluno: "+nome+"- Matricula: "+mat+"- Media: "+media);
  }
}
