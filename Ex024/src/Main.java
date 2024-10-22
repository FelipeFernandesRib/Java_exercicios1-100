/*
24) Faça um algoritmo que pergunte a distância que um passageiro deseja
percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
viagens até 200Km e R$0.45 para viagens mais longas.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a distância percorrida em km: ");
        double km = leia.nextDouble();

        if(km > 0 && km <= 200){
            System.out.printf("Valor a pagar R$: %.2f", (km * 0.50));
        }
        else if(km > 200){
            System.out.printf("Valor a pagar R$: %.2f", (km * 0.45));
        }
        else{
            System.out.print("Algo deu errado!\nTente novamente!");
        }

        leia.close();
    }
}