package topics.Array.Vector;

import java.util.Locale;
import java.util.Scanner;

//programa para ler um número inteiro(quantidade de produtos) e os dados (nome e preço). Armazenar os produtos em um vetor. Mostrar o preço médio.
public class MediaProducts {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Products[] vect = new Products[n];

        for(int i = 0; i < vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Products(name,price); //instanciar o novo produto e o vect[i] vai apontar para o obj.
        }

        double sum = 0.0;

        for(int i = 0; i < vect.length; i ++){
            sum += vect[i].getPrice(); //para somar os preços
        }

        double avarage = sum / vect.length;

        System.out.printf("Avarage: %.2f%n", avarage);

        sc.close();
    }
}
