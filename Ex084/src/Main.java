/*
84) Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses
valores em dois vetores, em posições relacionadas. No final, mostre uma listagem
contendo apenas os dados das pessoas menores de idade.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String [] nomes = new String[9];
        int [] idades = new int[9];
        int quantMenoresDeIdade = 0;

        for(int i = 0; i < nomes.length; i++){
            System.out.print("Informe um nome: ");
            String nome = leia.nextLine();
            nomes[i] = nome;

            System.out.print("Informe um idade: ");
            int idade = leia.nextInt();
            leia.nextLine();
            idades[i] = idade;
        }

        System.out.println("Dados das pessoas menores de idade: ");
        for(int i = 0; i < nomes.length; i++){
            if(idades[i] < 18){
                System.out.println("Nome: " + nomes[i] + "\nIdade: " + idades[i] + "\n");
                quantMenoresDeIdade++;
            }
        }
        if(quantMenoresDeIdade == 0){
            System.out.println("Nenhum menor de idade foi inserido");
        }

        leia.close();
    }
}