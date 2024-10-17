/*
14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantos Km foram rodados: ");
        double km = leia.nextDouble();

        System.out.println("Quantos dias o carro ficou alugado: ");
        int dias = leia.nextInt();

        System.out.println("Total a pagar R$: " + ((km * 0.2) + (dias * 90)));

        leia.close();
    }
}