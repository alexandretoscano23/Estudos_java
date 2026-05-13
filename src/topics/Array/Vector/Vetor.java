package topics.Array.Vector;

import java.util.Locale;
import java.util.Scanner;

//programa que leia um número inteiro N (número de pessoas) e altura dessas pessoas. Caluclar a média dessas pessoas.
public class Vetor {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n]; //criar um vetor e passa o tamanho (n) - para receber o número de pessoas

        for(int i = 0; i < n; i++){
            vect[i] = sc.nextDouble(); //a cada loop,adiciona o valor em uma posição
        }

        double sum = 0.0;

        for(int i = 0; i < n; i++){
            sum += vect[i]; //percorrer o vetor e acumular a soma
        }

        double average = sum / n;

        System.out.printf("Average Height: %.2f%n", average);

        sc.close();
    }
}
