/*
15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
por hora trabalhada.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe quantos dias foram trabalhados esse mês: ");
        int dias = leia.nextInt();

        System.out.println("Salário desse mês R$: " + dias * 8 * 25);

        leia.close();
    }
}