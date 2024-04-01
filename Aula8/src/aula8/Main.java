package aula8;
import java.util.*;
//import java.util.Random;

/* @author fabiodemo */
public class Main {

    public static void main(String[] args) {
        //Random gerador = new Random();
        Scanner sc = new Scanner(System.in);
        Banco[] Bank = new Banco[1];
        ArrayList <Cliente> client = new ArrayList <> ();
        for(int i = 0; i < 1; i++){
            Bank[i] = new Banco();
            Bank[i].setBanco();
        }
        Bank[0].getBanco();
    }
}
