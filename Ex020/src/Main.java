/*
20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        System.out.print("Informe um número inteiro: ");
        int num = leia.nextInt();

        if( num % 2 == 0){
            System.out.println("\nEsse número é PAR");
        }
        else{
            System.out.println("\nEsse número é IMPAR");
        }

        leia.close();
    }
}