/*
4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int valor1 = leia.nextInt();

        System.out.println("Digite outro valor inteiro: ");
        int valor2 = leia.nextInt();

        System.out.println("A soma entre " + valor1 + " e " + valor2 + " é igual a " + (valor1 + valor2));
    }
}