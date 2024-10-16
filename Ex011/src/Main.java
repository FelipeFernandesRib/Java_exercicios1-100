/*
11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
segundo grau e mostre o valor de Delta.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        double a = leia.nextDouble();

        System.out.println("Informe o valor de B: ");
        double b = leia.nextDouble();

        System.out.println("Informe o valor de C: ");
        double c = leia.nextDouble();

        double delta = b * b - 4 * a * c;

        System.out.println("Delta vale: " + delta);

        leia.close();
    }
}