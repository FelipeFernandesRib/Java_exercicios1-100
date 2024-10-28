/*
30) [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
de triângulo será formado:
- EQUILÁTERO: todos os lados iguais
- ISÓSCELES: dois lados iguais
- ESCALENO: todos os lados diferentes
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

            if(reta1 == reta2 && reta1 == reta3) {
                System.out.print(" EQUILÁTERO: todos os lados iguais");
            }
            else if(reta1 == reta2 || reta1 == reta3 || reta2 == reta3) {
                System.out.print(" ISÓSCELES: dois lados iguais");
            }
            else{
                System.out.print(" ESCALENO: todos os lados diferentes");
            }
        }
        else {
            System.out.print("Não seria possível formar um triângulo");
        }

        leia.close();
    }
}