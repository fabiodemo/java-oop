package aula7;
import java.util.concurrent.ThreadLocalRandom;

/* @author fabiodemo */
public class ExercícioI {
    
    public static void main(String[] args){
        int v1[] = new int[20];
        int max = 50, min = 0, menor = 51, pos = 0;
        for(int i = 0; i < v1.length-1; i++)
            v1[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.print("Vetor: ");
        for(int e: v1)
            System.out.print(e+" |");
        for(int i = 0; i < v1.length-1; i++)
            if(v1[i] < menor){
                menor = v1[i];
                pos = i;
            }
        System.out.println("\nO menor valor eh: "+menor+" e encontra-se na posicao "+pos+" do vetor");
    }
}
