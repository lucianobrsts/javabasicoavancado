package secao5;

public class OperadoresLogicos {

    public static void main(String[] args) {

        int idade = 18;
        boolean temCarteiraDeMotorista = true;

        System.out.println(idade >= 18 && temCarteiraDeMotorista);
        System.out.println(idade >= 18 && temCarteiraDeMotorista  == true);

        boolean carteiraVencida = false;

        System.out.println(idade >= 18 && temCarteiraDeMotorista && carteiraVencida == false);

        int a = 10;
        int b = 20;

        if(a > 5 && b > 10) {
            System.out.println("Deu certo!");
        }

        if(a > 55 && b > 10) {
            System.out.println("Deu certo 2!");
        }

    }

}
