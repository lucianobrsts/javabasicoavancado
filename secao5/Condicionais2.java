package secao5;

public class Condicionais2 {

    public static void main(String[] args) {

        int numero = 11;

        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println(resultado);

        int idade = 18;
        boolean temCarteira = true;

        if (idade >= 18) {
            if (temCarteira) {
                System.out.println("Pode dirigir");
            } else {
                System.out.println("Precisa ter a habilitação para dirigir!");
            }
        } else {
            System.out.println("Você não pode dirigir ainda!");
        }

        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean resultado2 = a && b || c;
        System.out.println(resultado2);

        resultado2 = a || b && c;
        System.out.println(resultado2);

        resultado2 = !(a || b) && c;
        System.out.println(resultado2);

    }
}
