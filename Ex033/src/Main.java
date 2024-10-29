/*
33) Escreva um programa para aprovar ou não o empréstimo bancário para a compra
de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
ela não pode exceder 30% do salário ou então o empréstimo será negado.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o valor da casa: ");
        double valorCasa = leia.nextDouble();

        System.out.print("Informe o salário do comprador: ");
        double salarioComprador = leia.nextDouble();

        System.out.print("Informe em quantos ele vai pagar a casa: ");
        int anosPagando = leia.nextInt();

        double prestacaoMensal = valorCasa / (anosPagando * 12);

        if(prestacaoMensal > (salarioComprador * 0.3)){
            System.out.print("Empréstimo negado");
        }
        else{
            System.out.print("Empréstimo aprovado");
        }

        leia.close();
    }
}