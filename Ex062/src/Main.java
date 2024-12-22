/*
62) Faça um programa usando a estrutura “faça enquanto” que leia a idade de
várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer ou
não continuar a digitar dados. No final, quando o usuário decidir parar, mostre
na tela:
a) Quantas idades foram digitadas
b) Qual é a média entre as idades digitadas
c) Quantas pessoas tem 21 anos ou mais.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int quantIdades = 0, quantPessoasTem21AnosOuMais = 0, idade;
        float mediaIdades = 0;
        String continuar;

        do{
            System.out.print("Informe uma idade: ");
            idade = leia.nextInt();
            leia.nextLine();

            quantIdades++;
            mediaIdades += idade;

            if(idade >= 21){
                quantPessoasTem21AnosOuMais++;
            }

            System.out.print("Deseja continuar?[S/N]: ");
            continuar = leia.nextLine();
        } while(continuar.equalsIgnoreCase("S"));

        mediaIdades /= quantIdades;

        System.out.println("\nResultado");
        System.out.println("Quantidade de idades cadastradas: " + quantIdades);
        System.out.println("Média de idades cadastradas: " + mediaIdades);
        System.out.println("Quantidade de pessoas com 21 anos ou mais: " + quantPessoasTem21AnosOuMais);

        leia.close();
    }
}