/*
10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe a largura da parede (em metros): ");
        double largura = leia.nextDouble();

        System.out.println("Informe a altura da parede (em metros): ");
        double altura = leia.nextDouble();

        double area = largura * altura;

        System.out.printf("Area: %.2f m²\n", area);
        System.out.printf("Serão necessários %.2f litros de tinta.", area/2);

        leia.close();
    }
}