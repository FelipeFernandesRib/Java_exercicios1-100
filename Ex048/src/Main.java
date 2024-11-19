/*
48) Faça um programa que leia 7 números inteiros e no final mostre o somatório
entre eles.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int quantNum = 1;
        int soma = 0;

        while(quantNum < 8) {
            System.out.print("Informe o primeiro número inteiro: ");
            int num = leia.nextInt();
            soma += num;
            quantNum++;
        }

        System.out.println("\nSoma dos números: " + soma);
        leia.close();
    }
}