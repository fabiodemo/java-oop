package aula11;

/* @author fabiodemo */
public class EmpregadoComissionado {
    private double vendasBrutas, comissao;
    private String nome, sobrenome;
    
    EmpregadoComissionado (){

    }

    public void setVendasBrutas(double vendasBrutas) {
        this.vendasBrutas = vendasBrutas;
    }

    public void setComissao(double comissao) {
        if(comissao > 0 && comissao < 1)
            this.comissao = comissao;
        else
            this.comissao = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getVendasBrutas() {
        return vendasBrutas;
    }

    public double getComissao() {
        return comissao;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    
    public double calculaSalario (){
        return this.vendasBrutas * this.comissao;
    }
}
