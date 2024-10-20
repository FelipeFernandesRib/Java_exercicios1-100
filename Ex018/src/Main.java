/*
18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
dela e depois mostre se ela pode ou não votar.
 */


import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int anoAtual = java.time.LocalDate.now().getYear();

        Scanner leia = new Scanner(System.in);

        System.out.print("Informe em que ano você nasceu: ");
        int anoNasc = leia.nextInt();

        int idade = anoAtual - anoNasc;

        if (idade < 16) {
            System.out.printf("Você não pode votar");
        }
        else {
            System.out.println("Você pode votar");
        }

        leia.close();
    }
}