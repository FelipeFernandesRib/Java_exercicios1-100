/*
3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o seu nome do funcionário:");
        String nomeFuncionario = leia.nextLine();

        System.out.println("Informe o sálario do funcionário:");
        String salarioFuncionario = leia.nextLine();

        System.out.println("O funcionário(a): " + nomeFuncionario + " recebe R$: " + salarioFuncionario + ".");
    }
}