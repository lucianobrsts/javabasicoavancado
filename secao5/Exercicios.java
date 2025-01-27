package secao5;

import java.util.Scanner;

public class Exercicios {
    
    public static void main(String[] args) {
        
        // Exercício 1
        Scanner teclado = new Scanner(System.in);
        /*/
        System.out.print("Digite o preço de um produto: ");
        double precoProduto = teclado.nextDouble();

        if(precoProduto < 50) {
            System.out.println("Barato");
        } else if(precoProduto >= 50 && precoProduto <= 100) {
            System.out.println("Médio");
        } else {
            System.out.println("Caro");
        }
        */

        // Exercício 2
        /*
        System.out.print("Digite seu login: ");
        String nomeUsuario = teclado.nextLine();

        System.out.print("Digite sua senha: ");
        String senhaUsuario = teclado.nextLine();

        if(nomeUsuario.equals("admin") && senhaUsuario.equals("1234")) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
         */

        // Exercício 3
        /*
        System.out.print("Digite um número inteiro: ");
        String par = "Par";
        String impar = "Ímpar";
        int numero = teclado.nextInt();

        if(numero%2 == 0) {
            System.out.println(par);
        } else {
            System.out.println(impar);
        }
         */

         // Exercício 4
         /*
         System.out.print("Digite um número correspondente ao dia da semana: ");
         int diaDaSemana = teclado.nextInt();

         switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo, Final de semana!");
                break;
            case 2:
                System.out.println("Segunda-feira, Dia útil!");
                break;
            case 3:
                System.out.println("Terça-feira, Dia útil!");
                break;
            case 4:
                System.out.println("Quarta-feira, Dia útil!");
                break;
            case 5:
                System.out.println("Quinta-feira, Dia útil!");
                break;
            case 6:
                System.out.println("Sexta-feira, Final de semana!");
                break;
            case 7:
                System.out.println("Sábado, Final de semana!");
                break;
         
            default:
            System.out.println("digite um valor válido para os dias da semana!");
                break;
         }
        */

        // Exercício 5
        /*
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        if(numero >= 10 && numero <= 20) {
            System.out.println("Dentro do intervalo!");
        } else {
            System.out.println("Fora do intervalo!");
        }
        */

        // Exercício 6
        System.out.print("Digite uma letra: ");
        String letra = teclado.nextLine();

        if(letra.equalsIgnoreCase("a") 
            || letra.equalsIgnoreCase("e") 
            || letra.equalsIgnoreCase("i") 
            || letra.equalsIgnoreCase("o") 
            || letra.equalsIgnoreCase("u") ) {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }

        teclado.close();

    }
}
