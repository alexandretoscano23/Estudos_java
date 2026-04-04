package topics.Array;

import java.util.Locale;
import java.util.Scanner;

public class Array {
   public static void main(String[] args){
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       double[] notasAlunoA = new double[4]; //criando array de 4 índices

       //adicionar valores aos índices
       notasAlunoA[0] = 7.9;
       notasAlunoA[1] = 8.0;
       notasAlunoA[2] = 6.7;
       notasAlunoA[3] = 9.7;

       //calcular média
       double totalAlunoA = 0;
       for(int i = 0; i < notasAlunoA.length; i++){
           totalAlunoA = totalAlunoA + notasAlunoA[i];
       }

       //System.out.printf("%.2f", totalAlunoA / notasAlunoA.length);

       double[] notasAlunosB = {7.7, 8.3, 6.5, 9.0}; //passando valores literais

       double totalAlunoB = 0;
       for (int i = 0; i < notasAlunosB.length; i++) {
           totalAlunoB += notasAlunosB[1];
       }

       //System.out.printf("%.2f", totalAlunoB / notasAlunosB.length);

       //Valores passados pelo usuário
       double[] notasAlunoC = new double[3];

       double totalAlunosC = 0;
       for (int i = 0; i < notasAlunoC.length; i++) {
           System.out.print("Nota :");
           double nota = sc.nextDouble();
           notasAlunoC[i] = nota;
           totalAlunosC += notasAlunoC[i];
       }

       System.out.printf("Média: %.2f", totalAlunosC / notasAlunoC.length);

       sc.close();
   }
}
