/*
12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o preço de um produto em real R$: ");
        double preco = leia.nextDouble();

        double precoPromocional = preco - (preco * 0.05);

        System.out.println("Este produto com preço promocional custaria R$: " + precoPromocional);

    }
}