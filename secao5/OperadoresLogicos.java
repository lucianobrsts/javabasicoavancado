package secao5;

public class OperadoresLogicos {

    public static void main(String[] args) {

        int idade = 18;
        boolean temCarteiraDeMotorista = true;

        System.out.println(idade >= 18 && temCarteiraDeMotorista);
        System.out.println(idade >= 18 && temCarteiraDeMotorista == true);

        boolean carteiraVencida = false;

        System.out.println(idade >= 18 && temCarteiraDeMotorista && carteiraVencida == false);

        int a = 10;
        int b = 20;

        if (a > 5 && b > 10) {
            System.out.println("Deu certo!");
        }

        if (a > 55 && b > 10) {
            System.out.println("Deu certo 2!");
        }

        boolean estaChovendo = false;
        boolean temGuardaChuva = true;

        System.out.println(estaChovendo || temGuardaChuva);
        System.out.println(false || false);
        System.out.println(10 > 20 && 100 == 200);

        // O usuário pode participar do clube
        // ele precisa ter > 16 anos ou ser membro
        int idade2 = 16;
        boolean ehMembro = true;

        if(idade2 > 16 || ehMembro) {
            System.out.println("Você pode entrar!");
        } else {
            System.out.println("Entrada negada!");
        }


    }

}
