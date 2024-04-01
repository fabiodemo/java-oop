package aula8;

import java.util.Scanner;

/**
 *
 * @author fabiodemo
 */
public class Banco {
    int idBanco;
    String Nome, Endereço;
    public Banco() {
    }
    
    public void setBanco(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o id do banco");
        this.idBanco = sc.nextInt();
        System.out.println("Digite o nome do banco");
        this.Nome = sc.next();
        System.out.println("Digite o endereço");
        this.Endereço = sc.next();
    }
    
    public void getBanco(){
        System.out.println("Id: "+this.idBanco+". Banco: "+this.Nome+". Endereço: "+this.Endereço);
    }

    
}
