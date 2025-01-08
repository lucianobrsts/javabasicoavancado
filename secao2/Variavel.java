package secao2;

public class Variavel {

    public static void main(String[] args) {

        // 1- O que são variáveis
        // tipo -> nome -> atribuir um valor;
        String nome = "Luciano";

        // nome => "Matheus"
        System.out.println(nome);

        // 2- Atribuição de variável com outra
        String teste = "Teste";

        String testando = teste;

        System.out.println(testando);

        long numeroGrande = 9999999999L;

        // int numeroGrandeDois = numeroGrande;

        System.out.println(numeroGrande);

        // 3- Comentários

        /*
         * 
         * comentário linha 1
         * comentario linha 2
         * comentário linha 3
         */

        /**
         * Função para somar números
         * param1: Primeriro número
         * Param2: Segundo número
         * 
         * Retorno: A soma
         */

        // 4- String
        String firstName = "Luciano";
        String lastName = "Brito";

        System.out.println(firstName + lastName);
        System.out.println(firstName + " " + lastName);
        System.out.println("O nome dele é " + firstName);
        String fullName = firstName + " " + lastName;

        // Concatenação = operador + nas strings para uni-las.
        System.out.println(fullName);

        // 5- Char

        char letra = 'A';
        System.out.println(letra);

        String letra2 = "A";
        System.out.println(letra2);

        char simbolo = '$';
        System.out.println(simbolo);

        //6 -  int
        int n = 42;
        System.out.println(n);
        System.out.println(n + 5);
        System.out.println(n * 10);
        System.out.println(n / 5);

        int soma = n + 12;
        System.out.println(soma);

        // 7- Long

        long pupulacaoMundial = 780000000000000L;
        System.out.println(pupulacaoMundial);

        long grandeNumero = 1_000_000L;
        System.out.println(grandeNumero + 1);

        // Double
        double preco = 19.99;
        System.out.println(preco);
        System.out.println(preco - 12);
        System.out.println(preco / 2);
        
        double pi = 3.141_592_123;
        System.out.println(pi);
        
        double valorComD = 12.1D;
        System.out.println(valorComD);

        // 9 - Operadores Aritmeticos - p1

        int soma2 = 12 + 5;
        System.out.println(soma2);
        System.out.println(22 + 4);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 2.5);
        System.out.println(10.0 / 2.5);

        // para ter um resultado quebrado (1.5), pelo menos 1 número da divisão tem que ser ponto flutuante

        System.out.println(10 / 3);
        System.out.println(10.0 / 3);
        System.out.println(10.0 % 3);

        //  10 - Operadores Aritméticos - p2
        int x = 5;
        x++;
        x++;
        x++;
        x++;
        System.out.println(x);

        int y = 5;
        y--;
        System.out.println(y);

        int a = 10;
        a += 5;
        // a = a + 5;
        System.out.println(a);

        int b = 10;
        b -= 5;
        System.out.println(b);

        b -= a;
        System.out.println(b);

        // 11 -  Type Casting

        // conversão implicita (widening)
        int numero2 = 42;
        long numeroLong = numero2;
        double numeroDouble = numero2;
        System.out.println(numeroLong);
        System.out.println(numeroDouble);

        // conversão explicita (narrowing)
        double valorDouble = 9.78;
        int valorInt = (int) valorDouble;
        System.out.println(valorInt);

        // casting de char para int
        char letra3 = 'A';
        int codigoAscii = (int) letra3;
        System.out.println(codigoAscii);

        // 12 - Constantes
        final int DIAS_DA_SEMANA = 7;

        System.out.println("Dias da semana: " + DIAS_DA_SEMANA);

        // 13 - Var
        var z = 10;
        System.out.println(z);

        // z = "Teste" - Erro pq ele já foi inferido como um int
        z = 5;
        System.out.println(z);

        var texto2 = "teste";
        var doubleTeste = 2.0;
        System.out.println(texto2);
        System.out.println(doubleTeste);

    }
}
