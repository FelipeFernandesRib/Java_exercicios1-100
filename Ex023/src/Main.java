/*
23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
para todos, mas especialmente para mulheres. Faça um programa que leia nome,
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
que: - Homens ganham 5% de desconto - Mulheres ganham 13% de desconto
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        String nome = leia.nextLine();

        System.out.print("Informe o seu sexo [F/M]");
        String sexo = leia.nextLine();

        System.out.print("Informe o valor das suas compras R$: ");
        double valor = leia.nextDouble();

        if (sexo.equals("F") || sexo.equals("f") || sexo.equals("Feminimo") || sexo.equals("FEMININO")) {
            System.out.printf("Valor total com desconto %.2f", valor-valor*0.13);
        }
        else if (sexo.equals("M") || sexo.equals("m") || sexo.equals("Masculino") || sexo.equals("MASCULINO")) {
            System.out.printf("Valor total com desconto %.2f", valor-valor*0.05);
        }
        else {
            System.out.print("Algo deu errado! Informe corretamente o seu sexo!");
        }

        leia.close();
    }
}