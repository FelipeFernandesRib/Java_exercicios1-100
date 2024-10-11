/*
5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe a primeira nota do aluno: ");
        double nota1 = leia.nextDouble();

        System.out.println("Informe a segunda nota do aluno: ");
        double nota2 = leia.nextDouble();

        System.out.println("A média entre " + nota1 + " e " + nota2 + " é igual a " + (nota1 + nota2)/2);
    }
}