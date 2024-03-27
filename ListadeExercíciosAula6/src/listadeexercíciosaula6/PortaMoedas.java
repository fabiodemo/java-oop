/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercíciosaula6;

/**
 *
 * @author fabiodemo
 */
public class PortaMoedas {
    String alfanum, nome;
    double saldo;

        PortaMoedas(){
    }
    
    public String getAlfaNum() {
        return alfanum;
    }

    public void setAlfaNum(String alfanum) {
        this.alfanum = alfanum;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }
    
    public int Pagamento(double saldo, double valor){
        if(valor > saldo) {
            System.out.println("Nao foi possivel realizar o pagamento! Valor ultrapassa o saldo atual");
            return 0;
        }
        this.saldo = saldo - valor;
        return 1;
    }

}