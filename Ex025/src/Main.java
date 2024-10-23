/*
25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
Analise seus comprimentos e diga se é possível formar um triângulo com essas
retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
de cada lado deve ser menor que a soma dos outros dois.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o tamanho de um segmento de reta: ");
        double reta1 = leia.nextDouble();

        System.out.print("Informe o tamanho de outro segmento de reta: ");
        double reta2 = leia.nextDouble();

        System.out.print("Informe o tamanho de mais um segmento de reta: ");
        double reta3 = leia.nextDouble();

        if(reta1 < (reta2 + reta3) && reta2 < (reta1 + reta3) && reta3 < (reta1 + reta2)) {
            System.out.print("Seria possível formar um triângulo");
        }
        else {
            System.out.print("Não seria possível formar um triângulo");
        }

        leia.close();
    }
}