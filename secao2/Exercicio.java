package secao2;

public class Exercicio {

    public static void main(String[] args) {
        System.out.println("---Exercício 1--------------------------------");
        int numero = 10;
        int dobroNumero = 2 * numero;
        System.out.println("Número: " + numero);
        System.out.println("Dobro do número: " + dobroNumero);
        System.out.println();

        System.out.println("---Exercício 2--------------------------------");
        char letra  = 'B';
        int charParaInt = (int) letra;
        System.out.println("variável tipo char: " + letra);
        System.out.println("Representação int para o char: " + charParaInt);
        System.out.println();
        
        System.out.println("---Exercício 3--------------------------------");
        double valor1 = 15.75;
        double valor2 = 20.40;
        double totalValores = valor1 + valor2;
        System.out.println("Valor1: " + valor1);
        System.out.println("Valor2: " + valor2);
        System.out.println("Soma dos valores 1 e 2: " + totalValores);
        System.out.println();
        
        System.out.println("---Exercício 4--------------------------------");
        long bilhoes = 2_000_000_000;
        int intRecebeBilhoes = (int) bilhoes;
        System.out.println("O valor long: " + bilhoes);
        System.out.println("O valor convertido para int: " + intRecebeBilhoes);
        System.out.println();

        System.out.println("---Exercício 5--------------------------------");
        String olaMundo = "Olá Mundo!";
        String bemVindo = "Bem-vindo ao mundo java!";
        String concatenarTextos = olaMundo + ", " + bemVindo;
        System.out.println(concatenarTextos);
        System.out.println();
    }
    
}
