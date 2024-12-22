/*
63) Crie um programa usando a estrutura “faça enquanto” que leia vários números.
A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na
tela:
a) O somatório entre todos os valores
b) Qual foi o menor valor digitado
c) A média entre todos os valores
d) Quantos valores são pares
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int quantValoresPares = 0, contador = 0;
        float  menorValor = Float.MAX_VALUE, num, somatorio = 0, media;
        String continuar;

        do{
            System.out.print("Informe um número: ");
            num = leia.nextFloat();
            leia.nextLine();

            somatorio += num;
            contador++;

            if(num < menorValor){
                menorValor = num;
            }
            if(num % 2 == 0){
                quantValoresPares++;
            }

            System.out.print("Deseja continuar?[S/N]: ");
            continuar = leia.nextLine();

        } while(continuar.equalsIgnoreCase("S"));

        media = somatorio / contador;
        System.out.println("\nResultado");
        System.out.println("Somatório de todos os valores: " + somatorio);
        System.out.println("Menor valor digitado: " + menorValor);
        System.out.println("Média de todos os valores: " + media);
        System.out.println("Quantidade de valores pares: " + quantValoresPares);

        leia.close();
    }
}