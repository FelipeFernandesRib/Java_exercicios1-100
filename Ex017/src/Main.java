/*
17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Qual a velocidade do carro: ");
        double velocidade = leia.nextDouble();

        if(velocidade > 80){
            double valorMulta = (velocidade - 80) * 5;
            System.out.printf("Você foi multado \nValor da multa R$ %.2f: " , valorMulta);
        }

        leia.close();
    }
}