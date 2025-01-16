package secao3;

import java.util.Scanner;

/**
 * Projeto tabuada
 * receber um número pelo scanner, exibir a tabuada do mesmo
 */
public class Tabuada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String textoInicial = "Digite um número entre 1 e 10 para que sua tabuada seja exibida: ";
        int limiteTabuada = 10;
        int valorParaTabuada = 0;
        char repetirExibirTabuada = 's';

        while (valorParaTabuada > 10 || valorParaTabuada < 1) {
            System.out.print(textoInicial);
            valorParaTabuada = entrada.nextInt();
        }

        while (repetirExibirTabuada != 'n') {
            for (int i = 1; i <= limiteTabuada; i++) {
                System.out.print(i + " x " + valorParaTabuada + " = " + (i * valorParaTabuada));
                System.out.println();
            }

            System.out.println("Deseja exibir outra tabuada? ");
            System.out.println("Digite s ou n");
            repetirExibirTabuada = entrada.next().charAt(0);

            if(repetirExibirTabuada == 's') {
                System.out.print(textoInicial);
                valorParaTabuada = entrada.nextInt();
            }
        }

        entrada.close();
    }
}
