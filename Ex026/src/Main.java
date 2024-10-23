/*
26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
na tela uma das mensagens abaixo:
- O primeiro valor é o maior
- O segundo valor é o maior
- Não existe valor maior, os dois são iguais
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe um valor inteiro: ");
        int valor = leia.nextInt();

        System.out.print("Informe outro valor inteiro: ");
        int valor2 = leia.nextInt();

        if (valor > valor2) {
            System.out.print("O primeiro valor é o maior");
        }
        else if (valor < valor2) {
            System.out.print("O segundo valor é o maior");
        }
        else {
            System.out.print("Não existe valor maior, os dois são iguais");
        }

        leia.close();
    }
}