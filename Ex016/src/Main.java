/*
16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner  leia = new Scanner(System.in);

        System.out.print("Informe quantos cigarros você fuma por dia: ");
        int quantCigarrosDia = leia.nextInt();

        System.out.print("Informe há quantos anos você fuma: ");
        double quantAnos = leia.nextDouble();

        /*Obs: "365.25" seria por conta de anos bissextos,
         o vezes 10 está os 10 minutos de vida,
         o 60 está dividindo os minutos em horas e
         o 24 está transformando o resultado em dias
         */
        double tempoPerdido = (quantCigarrosDia * (quantAnos * 365.25) * 10) / 60 / 24;

        System.out.println("Você perdeu " + tempoPerdido + " dias de vida");

        leia.close();
    }
}