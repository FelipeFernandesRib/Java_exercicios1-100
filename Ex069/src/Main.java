/*
69) [DESAFIO] Desenvolva um programa que leia o primeiro termo e a razão de uma
PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA e
a soma entre todos os valores da sequência.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int soma = 0;

        System.out.print("Informe o primeiro termo da PA (Progressão Aritmética): ");
        int primeiroTermo = leia.nextInt();

        System.out.print("Informe a razão da PA: ");
        int razao = leia.nextInt();

        for( int i = 0; i < 10; i++){
            System.out.print(primeiroTermo + razao * i + " ");
            soma += primeiroTermo + razao * i;
        }
        System.out.println("\nSoma de todos os valores da sequência: " + soma);
        leia.close();
    }
}