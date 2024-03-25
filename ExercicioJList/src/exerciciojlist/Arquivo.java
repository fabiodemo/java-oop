package exerciciojlist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author fabiodemo
 */
public class Arquivo {
      private String nomeArquivo;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String gravar(String texto) throws IOException{
        FileWriter arqGrava = new FileWriter(this.nomeArquivo+".txt", true);
        PrintWriter arqDados = new PrintWriter(arqGrava);
        arqDados.println(texto);
        arqDados.close();
        arqGrava.close();
        return null;
    }

    public String ler(){
        String texto = "";
        String conteudo = "";
        try {
            FileReader arqLe = new FileReader(this.nomeArquivo+".txt");
            BufferedReader br = new BufferedReader(arqLe);
            while ((conteudo = br.readLine()) != null){
                texto = texto + conteudo + "\n";
            }
            br.close();
            arqLe.close();
        } catch (Exception e){
            texto = e.getMessage();
        }
        return texto;
    }
}