/*
50) Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e
mostre na tela:
a) Quais foram os números sorteados
b) Quantos números estão acima de 5
c) Quantos números são divisíveis por 3
*/

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random geradorDeNum = new Random();
        int contador = 1, numAcimaDe5 = 0, numDivisiveispor3 = 0;
        int [] numeros  = new int[20];
        while(contador <= 19){
            numeros[contador] = geradorDeNum.nextInt(11);
            System.out.println(numeros[contador]);
            if(numeros[contador] > 5 ){
                numAcimaDe5++;
                            }
            if(numeros[contador] % 3 == 0 && numeros[contador] != 0){
                numDivisiveispor3++;
            }
            contador++;
        }
        
        System.out.println("\nNúmeros sorteados: ");
        for(int nume : numeros ){
            System.out.print(nume + " ");
        }

        System.out.print("\nTivemos " + numAcimaDe5 + " números acima de 5");
        System.out.print("\nTivemos " + numDivisiveispor3 + " números divisíveis por 3");
    }
}