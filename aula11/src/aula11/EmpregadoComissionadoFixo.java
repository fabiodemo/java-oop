package aula11;

/* @author fabiodemo */
public class EmpregadoComissionadoFixo extends EmpregadoComissionado {
    private double salarioFixo;
    EmpregadoComissionadoFixo (){
        
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    public void getAll (){
        System.out.println("Nome: "+super.getNome()+" "+super.getSobrenome()+"\nComissao: "+super.getComissao()+"\nVendas brutas: "+super.getVendasBrutas());
    }
    
    @Override
    public double calculaSalario (){
        return super.calculaSalario() + salarioFixo;
    }
}
