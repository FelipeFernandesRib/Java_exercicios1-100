/*
35) Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
tabela a seguir:
- Carros populares (aluguel de R$90 por dia)
- Até 100Km percorridos: R$0,20 por Km
- Acima de 100Km percorridos: R$0,10 por Km
- Carros de luxo (aluguel de R$150 por dia)
- Até 200Km percorridos: R$0,30 por Km
- Acima de 200Km percorridos: R$0,25 por
*/

import java.util.Scanner;
public class Main {
    public static double valorASerPago = 0.0;
    public static double valorDiaria = 0.0;
    public static double valorPorKm = 0.0;
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o tipo de carro alugado\n1 para popular\n2 para de luxo\nopcao: ");
        int tipoCarro = leia.nextInt();

        System.out.print("Informe quantos dias o carro ficou alugado: ");
        int dias = leia.nextInt();

        System.out.print("Informe quantos km foram percorridos: ");
        int km = leia.nextInt();

        if (tipoCarro == 1) {
           valorDiaria = 90;
           if(km <= 100){
               valorPorKm = km*0.20;
           }
           else{
               valorPorKm = km*0.10;
           }
        }
        else if (tipoCarro == 2) {
            valorDiaria = 150;
            if(km <= 200){
                valorPorKm = km*0.30;
            }
            else{
                valorPorKm = km*0.25;
            }
        }


        valorASerPago = (valorDiaria * dias)+ valorPorKm;

        System.out.printf("Valor a ser pago R$: %.2f ", valorASerPago);

    }
}