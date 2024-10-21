/*
21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
BISSEXTO.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe um ano para verificarmos se ele é ou não BISSEXTO: ");
        int ano = leia.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("Esse ano é BISSEXTO");
        }
        else {
            System.out.println("Esse ano não é BISSEXTO");
        }

        leia.close();
    }
}