package secao5;

public class Condicionais {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2);
        System.out.println(str1 == "java");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Java"));

        String str3 = "JAVA";

        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));

        int numero = 10;

        if (numero > 125) {
            System.out.println("O número é maior que 5");
        }

        String texto = "Teste";

        if (texto.equals("Texto")) {
            System.out.println("O texto é: Texto!");
        }

        int q = 17;

        if (q > 10) {
            System.out.println("Q é maior que 10");
        } else {
            System.out.println("Insira um número maior que 10");
        }

        if(texto.equalsIgnoreCase("teste")) {
            System.out.println("o texto é: Teste");
        } else {
            System.out.println("O texto não é igual");
        }

        double nota = 10.0;

        if (nota == 10) {
            System.out.println("Você tirou a nota máxima, parabéns!");
        } else if(nota >= 9) {
            System.out.println("A nota é muito boa!");
        } else if (nota >= 7) {
            System.out.println("Acima de média");
        } else {
            System.out.println("Abaixo da média");
        }

    }
}
