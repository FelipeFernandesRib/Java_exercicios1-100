/*
91) Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
valores para um procedimento Maior() que vai verificar qual deles é o maior e
mostrá-lo na tela. Caso os dois valores sejam iguais, mostrar uma mensagem
informando essa característica.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double num1 = leia.nextDouble();

        System.out.print("Informe o segundo valor: ");
        double num2 = leia.nextDouble();

        Maior(num1,num2);
        leia.close();
    }
    public static void Maior(double num1, double num2) {
        if (num1 > num2) {
            System.out.printf("Maior valor: %.2f", num1);
        }
        else if (num1 < num2) {
            System.out.printf("Maior valor: %.2f", num2);
        }
        else {
            System.out.println("Os dois valores são iguais");
        }
    }
}