package secao6;

import java.util.Scanner;

public class CalculadoraImc {

    private static double calcularImc(double peso, double altura) {

        return peso / (altura * altura);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String diagnostico = "";

        System.out.print("Digite o seu peso em Kg: ");
        double peso = teclado.nextDouble();

        System.out.print("Digte sua altura em metros: ");
        double altura = teclado.nextDouble();

        double resultadoImc = calcularImc(peso, altura);

        if (resultadoImc < 18.5) {
            diagnostico = "Abaixo do peso";
        } else if (resultadoImc >= 18.5 && resultadoImc <= 24.9) {
            diagnostico = "Peso normal";
        } else if (resultadoImc >= 25 && resultadoImc < 29.9) {
            diagnostico = "Sobrepeso";
        } else {
            diagnostico = "Obesidade";
        }

        System.out.printf("O o calculo do IMC é %.2f:\n ", resultadoImc);
        System.out.println("O seu diagnostico é: " + diagnostico);

    }
}
