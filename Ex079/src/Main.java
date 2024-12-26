/*
79) Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor.
No final, mostre quais são os números pares que foram digitados e em que
posições eles estão armazenados.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int [] num = new int [10];

        for (int i = 0; i < 10; i++) {
        System.out.print("Informe um número inteiro: ");
        int numEscolhido = leia.nextInt();

        num[i] = numEscolhido;
        }

        System.out.println("\nNúmeros pares: ");
        for (int i = 0; i < 10; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println("\nSuas posiçês no vetor: ");
        for (int i = 0; i < 10; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        leia.close();
    }
}