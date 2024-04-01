package aula11;

import java.util.Scanner;

/* @author fabiodemo */
public class Contato extends Agenda {
    String Nome, Telefone, Endereco;
    
    Contato (){
        
    }
    
    public void setContato(){
        Scanner sc = new Scanner(System.in);
        this.Nome = sc.next();
        this.Telefone = sc.next();
        this.Endereco = sc.next();
    }
    
    @Override
    public void ObterInfo(){
        System.out.println("Nome do contato: "+this.Nome+". Telefone: "+this.Telefone+". Endereco: "+this.Endereco);
    }
}
