package topics.Array;

public class ForEach {
    public static void main(String[] args){
        //percorrer o array de forma mais rápida - passando por todos os valores
        double[] notas = {9.9, 8.7, 7.2, 9.4};

        for (double nota: notas){ //para cada repetição,nota armazena o indice
            System.out.println(nota);
        }
    }
}
