/*
2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-
vindas para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Olá, qual o seu nome?");
        String nome = leia.nextLine();
        System.out.println("Seja bem vindo " + nome);
    }
}