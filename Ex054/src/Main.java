/*
54) Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando
no final:
a) Qual foi a média de altura do grupo
b) Quantas pessoas pesam mais de 90Kg
c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int contador = 1, pesaMaisDe90Kg = 0, pesaMenosDe50EComMenosDe160 = 0, medemMaisDe190EPesamMaisDe100Kg = 0;
        float mediaAltura = 0;

        while(contador <= 7){
            System.out.print("Informe o peso da " + contador + "º pessoa: ");
            float peso = leia.nextFloat();

            System.out.print("Informe a altura da " + contador + "º pessoa: ");
            float altura = leia.nextFloat();

            if(peso > 90){
                pesaMaisDe90Kg++;
            }
            if (peso < 50 && altura < 1.60){
                pesaMenosDe50EComMenosDe160++;
            }
            if(altura > 1.90 && peso > 100){
                medemMaisDe190EPesamMaisDe100Kg++;
            }

            contador++;
            mediaAltura += altura;
        }

        mediaAltura = mediaAltura / 7;

        System.out.printf("\n\nMédia de altura do grupo: %.2f ", mediaAltura);
        System.out.println("\nPessoas que pesam mais de 90Kg: " + pesaMaisDe90Kg);
        System.out.println("Pessoas que pesam menos de 50Kg e tem menos de 1.60m de altura: " + pesaMenosDe50EComMenosDe160);
        System.out.println("Pessoas com mais de 1.90m e mais de 100Kg: " + medemMaisDe190EPesamMaisDe100Kg);

        leia.close();
    }
}