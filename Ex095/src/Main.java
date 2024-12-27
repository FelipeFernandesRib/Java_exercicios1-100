/*
95) Refaça o exercício 90, só que agora em forma de função Somador(), que vai
receber dois parâmetros e vai retornar o resultado da soma entre eles para o
programa principal.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        float num1 = leia.nextFloat();

        System.out.print("Informe o segundo valor: ");
        float num2 = leia.nextFloat();
        leia.close();

        float resultado = Somador(num1, num2);

        System.out.printf("\nA soma de %.2f + %.2f é: %.2f" , num1, num2, resultado);
    }
    public static float Somador(float primeiroValor, float segundoValor) {
        return primeiroValor + segundoValor;
    }
}