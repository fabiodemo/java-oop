package aula11;

/* @author fabiodemo */
public class Agenda {
    String nome;
    Contato[] c1 = new Contato[2];
    
    Agenda(){
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void getNome() {
        System.out.println("Nome da agenda: "+this.nome);
    }

    public void setC1() {
        for (Contato c11 : c1) {
            c11 = new Contato();
            c11.setContato();
        }
    }

    public void ObterInfo(){
        System.out.println("Nome da agenda: "+this.nome);
        for (Contato c11 : c1){
            c11.ObterInfo();
        }
    }
    
}
