/*
36) Um programa de vida saudável quer dar pontos atividades físicas que podem
ser trocados por dinheiro. O sistema funciona assim:
- Cada hora de atividade física no mês vale pontos
- até 10h de atividade no mês: ganha 2 pontos por hora
- de 10h até 20h de atividade no mês: ganha 5 pontos por hora
- acima de 20h de atividade no mês: ganha 10 pontos por hora
- A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
Faça um programa que leia quantas horas de atividade uma pessoa teve por mês,
calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.
*/

import java.util.Scanner;
public class Main {
    public static int pontosPorHora = 0;
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe quantas horas de atividade você fez no mês: ");
        int horasMes = leia.nextInt();


        if (horasMes <=10){
            pontosPorHora = horasMes * 2;
        }
        else if (horasMes <=20){
            pontosPorHora = horasMes * 5;
        }
        else {
            pontosPorHora = horasMes * 10;
        }

        System.out.printf("Você conseguiu " + pontosPorHora + " pontos \nEles valem R$: %.2f", pontosPorHora * 0.05);

        leia.close();
    }
}