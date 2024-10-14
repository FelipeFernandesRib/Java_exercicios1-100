/*
6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
        Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        int num = leia.nextInt();

        System.out.println("O antecessor de " + num + " é " + (num - 1));
        System.out.println("O sucessor de " + num + " é " + (num + 1));
    }
}