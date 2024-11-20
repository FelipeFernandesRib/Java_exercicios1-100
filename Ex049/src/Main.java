/*
49) Crie um programa que leia 6 números inteiros e no final mostre quantos deles
são pares e quantos são ímpares.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int contador = 1, num = 1, par = 0, impar = 0;

        while (contador <= 6){
            System.out.print("Informe um número inteiro: ");
            num = leia.nextInt();
            contador++;

            if( num % 2 == 0 ){
                par++;
            }
            else{
                impar++;
            }
        }
        System.out.println("\nNúmeros Pares: " + par + "\nNúmeros Impares: " + impar);
        leia.close();
    }
}