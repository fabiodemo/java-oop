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
public class Recibo {
String num;
String descr;
int quant;
double preco;

    Recibo (String num, String descr, int quant, double preco){
        this.num = num;
        this.descr= descr;
        this.quant = quant;
        this.preco = preco;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double ValorCobrado (int quant, double preco){
        if (preco < 0 || quant < 0) {
            return 0;
        }
        return (quant * preco);
    }
}
