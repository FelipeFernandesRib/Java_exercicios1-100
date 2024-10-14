/*
8) Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas.
Ex:
Digite uma distância em metros: 185.72
A distância de 85.7m corresponde a:
0.18572Km
1.8572Hm
18.572Dam
1857.2dm
18572.0cm
185720.0mm
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe uma distãncia em metros: ");
        float dist = leia.nextFloat();

        System.out.println("A distãncia de " + dist + " corresponde a:");
        System.out.println( (dist/1000)+ "km");
        System.out.println((dist/100)+"Hm");
        System.out.println((dist/10 + "Dam"));
        System.out.println((dist*10)+"dm");
        System.out.println((dist*100)+"cm");
        System.out.println((dist*1000)+"mm");
    }
}