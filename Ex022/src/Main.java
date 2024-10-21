/*
22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar. - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento. - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a sua idade: ");
        int idade = leia.nextInt();

        if (idade > 18) {
            System.out.print("Já fazem " + (idade - 18)  + " anos desde o seu alistamento");
        }
        else if (idade < 18) {
            System.out.print("Faltam " + (18 - idade) + " anos para o seu alistamento");
        }

        leia.close();
    }
}