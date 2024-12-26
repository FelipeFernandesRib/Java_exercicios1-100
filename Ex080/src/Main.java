/*
80) Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e
15 sorteados pelo computador. Depois disso, peça para o usuário digitar um
número (chave) e seu programa deve mostrar em que posições essa chave foi
encontrada. Mostre também quantas vezes a chave foi sorteada.
*/

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random Sorteador = new Random();
        int [] num = new int[30];
        int quantDeNumerosChave = 0;

        for(int i = 0; i < num.length; i++){
            num[i] = Sorteador.nextInt(1, 16);
        }

        System.out.print("informe um número chave entre 1 e 15: ");
        int numChave = leia.nextInt();

        System.out.print("Posições do vetor que tem um número igual ao número chave: ");
        for(int i = 0; i < num.length; i++){
            if(num[i] == numChave){
                System.out.print(i + " ");

                quantDeNumerosChave++;
            }
        }
        System.out.printf("\nQuantidade de números chave encontrados: " + quantDeNumerosChave);
        leia.close();

        System.out.print("\n\nVetor completo: ");
        for(int exibir : num){
            System.out.print(exibir + " ");
        }
    leia.close();
    }
}