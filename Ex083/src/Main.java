/*
83) [DESAFIO] Crie uma lógica que preencha um vetor de 20 posições com números
aleatórios (entre 0 e 99) gerados pelo computador. Logo em seguida, mostre os
números gerados e depois coloque o vetor em ordem crescente, mostrando no final
os valores ordenados.
*/

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random geradorNum = new Random();
        int [] numeros = new int[20];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = geradorNum.nextInt(1,100);
        }

        System.out.println("Números do vetor: ");
        for(int exibir : numeros){
            System.out.print(exibir + " ");
        }

        System.out.println("\nNúmeros do vetor ordenados: ");
        for(int x = 0; x < numeros.length; x++) {
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    int numeroDaFrente = numeros[i + 1];
                    int aux = numeros[i];
                    numeros[i + 1] = aux;
                    numeros[i] = numeroDaFrente;
                }
            }
        }
        for(int exibir : numeros){
            System.out.print(exibir + " ");
        }
    }
}