/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author fabiodemo
 */
public class Comissionado extends Empregado {
    private double totalVenda, taxaComissao;

    public Comissionado() {
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    
    @Override
    public double vencimento (){
        if(this.taxaComissao < 1 && this.taxaComissao > 0) return this.taxaComissao * this.totalVenda;
        else return this.totalVenda;
    } 
    
}
