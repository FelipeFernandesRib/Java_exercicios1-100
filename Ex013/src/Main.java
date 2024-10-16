/*
13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o salário do funcionário: ");
        double salario = leia.nextDouble();

        double novoSalario = salario + (salario*0.15);

        System.out.println("O novo salário com 15% de almento ficaria: " + novoSalario);

        leia.close();
    }
}