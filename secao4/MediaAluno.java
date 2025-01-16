package secao4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        int quantidadeNotas = 3;
        List<Double> notas = new ArrayList<>();
        double media = 0.0;

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = entrada.nextLine();

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = entrada.nextDouble();
            notas.add(nota);
        }

        for (Double nota : notas) {
            media += nota;
        }

        double mediaFinal = media / quantidadeNotas;

        System.out.println("O aluno " + nomeAluno + " obteve média final de " + mediaFinal);

        entrada.close();
    }
    
}
