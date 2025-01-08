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

    }
}
