/*
9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        System.out.println("Informe quanto dinheiro você tem na carteira: ");
        double saldo = leia.nextDouble();
        double valorConvertido = saldo/3.45;
        System.out.println("Com esse valor você poderia comprar US$" + Math.round(valorConvertido));
    }
}