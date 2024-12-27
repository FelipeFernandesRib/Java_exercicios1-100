/*
90) Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
valores para um procedimento Somador() que vai calcular e mostrar a soma entre
eles.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        float num1 = leia.nextFloat();

        System.out.print("Informe o segundo valor: ");
        float num2 = leia.nextFloat();

        Somador(num1, num2);
        leia.close();
    }
    public static void Somador(float primeiroValor, float segundoValor) {
        float soma = primeiroValor + segundoValor;
        System.out.printf("Soma dos valores: %.2f", soma);
    }
}