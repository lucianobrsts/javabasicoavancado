package secao3;

import java.util.Scanner;

/**
 * Projeto tabuada
 * receber um número pelo scanner, exibir a tabuada do mesmo
 */
public class Tabuada {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int limiteTabuada = 10;
        System.out.print("Digite um número entre 1 e 10 para que sua tabuada seja exibida: ");
        int valorParaTabuada = entrada.nextInt();

        if(valorParaTabuada > 10 || valorParaTabuada < 1) {
            System.out.println("Digite um valor entre 1 e 9!");
        }

        for (int i = 1; i <= limiteTabuada; i++) {
            System.out.print(i + " x " + valorParaTabuada + " = " + (i * valorParaTabuada));
            System.out.println();
        }

        for (int i = 1; i <= limiteTabuada; i++) {
            System.out.print(i + " x " + valorParaTabuada + " = " + (i * valorParaTabuada));
            System.out.println();
        }



    }
}
