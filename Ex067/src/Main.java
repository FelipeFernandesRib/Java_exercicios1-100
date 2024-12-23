/*
67) Faça um programa usando a estrutura “para” que leia um número inteiro
positivo e mostre na tela uma contagem de 0 até o valor digitado:
Ex: Digite um valor: 9
Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um valor inteiro positivo: ");
        int valor = leia.nextInt();

        for(int i = 0; i <= valor; i++){
            System.out.print(i + ", ");
        }

        System.out.print("FIM!");
        leia.close();
    }
}