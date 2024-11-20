/*
51) Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela
qual foi o maior e qual foi o menor preço digitados.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int contador = 1;
        float precoProdudo = 0, maiorPreco = 0, menorPreco = 0;

        while (contador <= 8) {
            System.out.print("Informe o preço do produto: ");
            precoProdudo = leia.nextFloat();

            if(contador == 1){
                maiorPreco = precoProdudo;
                menorPreco = precoProdudo;
            }
            if(precoProdudo > maiorPreco){
                maiorPreco = precoProdudo;
            }
            else if (precoProdudo < menorPreco){
                menorPreco = precoProdudo;
            }
            contador++;
        }
        System.out.print("Maior preço: " + maiorPreco + "\nMenor preço: " + menorPreco);
        leia.close();
    }
}