package secao2;

import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) {

        // 1- Testando scanner
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Olá " + nome + "!");

        System.out.print("Digite um valor numérico: ");
        int valor = entrada.nextInt();
        System.out.println("O número digitado foi: " + valor);

        // 2- Problema com nextLine
        System.out.print("Digite um número: ");
        entrada.nextLine();
        System.out.print("Digite um texto: ");

        entrada.close();
    }
}
