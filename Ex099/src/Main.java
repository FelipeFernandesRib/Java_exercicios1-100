/*
99) Faça um programa que possua uma função chamada Potencia(), que vai receber
dois parâmetros numéricos (base e expoente) e vai calcular o resultado da
exponenciação.
Ex: Potencia(5,2) vai calcular 5² = 25
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Vamos calcular uma Potencia!");
        System.out.print("Informe o valor da base: ");
        double base = leia.nextDouble();

        System.out.print("Informe o valor do expoente: ");
        double expoente = leia.nextDouble();
        leia.close();

        double resultPotencia = Potencia(base, expoente);
        System.out.println("Potencia: " + resultPotencia);
    }
    public static double Potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}