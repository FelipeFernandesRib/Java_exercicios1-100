/*
52) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
a) Qual é a média de idade do grupo
b) Quantas pessoas tem mais de 18 anos
c) Quantas pessoas tem menos de 5 anos
d) Qual foi a maior idade lida
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int contador = 1, maisDe18 = 0, menosDe18 = 0, maiorIdade = 0;
        float mediaIdade = 0;

        while (contador <= 10) {
            System.out.print("Informe a idade da " + contador + "º pessoa: ");
            int idade = leia.nextInt();

            if (idade > 18) {
                maisDe18 ++;
            }
            if (idade < 18) {
                menosDe18 ++;
            }
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            mediaIdade += idade;
            contador++;
        }

        mediaIdade = mediaIdade / 10;

        System.out.println("Média de idade: " + mediaIdade);
        System.out.println("Pessoas com mais de 18: " + maisDe18);
        System.out.println("Pessoas com menos de 18: " + menosDe18);
        System.out.println("Maior idade: " + maiorIdade);

        leia.close();
    }
}