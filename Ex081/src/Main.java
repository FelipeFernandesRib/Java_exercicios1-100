/*
81) Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No
final, mostre:
a) Qual é a média de idade das pessoas cadastradas
b) Em quais posições temos pessoas com mais de 25 anos
c) Qual foi a maior idade digitada (podem haver repetições)
d) Em que posições digitamos a maior idade
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int [] idadePessoas = new int [8];
        float mediaIdade = 0;
        int maiorIdadde = Integer.MIN_VALUE, quantDeMaiorIdadeRepetida = 0;
        StringBuilder posicaoMaiorIdade = new StringBuilder();

        for(int i = 0; i < 8; i++){
            System.out.print("Informe a idade de uma pessoa: ");
            int idade = leia.nextInt();

            idadePessoas[i] = idade;

            mediaIdade += idade;

            if(idade > maiorIdadde){
                maiorIdadde = idade;
            }
        }

        mediaIdade  /= 8;

        System.out.println("\nResultados: ");
        System.out.println("Média de idade: " + mediaIdade);
        System.out.print("Posições de idades maiores que 25 anos: ");

        for(int i = 0; i < idadePessoas.length; i++){
            if(idadePessoas[i] > 25){
                System.out.print(i + " ");
            }
            if(idadePessoas[i] == maiorIdadde){
                quantDeMaiorIdadeRepetida++;
                posicaoMaiorIdade.append(i).append(" ");
            }
        }

        System.out.println("\nMaior idade digitada: " + maiorIdadde);
        System.out.println("Número de vezes que a maior idade foi repetida: " + quantDeMaiorIdadeRepetida);
        System.out.println("Posições da maior idade: " + posicaoMaiorIdade);

        leia.close();
    }
}