/*
96) Crie um programa que tenha uma função Media(), que vai receber as 2 notas de
um aluno e retornar a sua média para o programa principal.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = leia.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota2 = leia.nextDouble();
        leia.close();

        double resultado = Media(nota1, nota2);

        System.out.printf("Média: %.2f\n", resultado);
    }
    public static double Media(double n1, double n2) {
        return (n1 + n2) / 2;
    }
}