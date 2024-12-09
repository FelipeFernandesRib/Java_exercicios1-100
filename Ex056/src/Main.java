/*
56) Crie um programa que leia vários números pelo teclado e mostre no final o
somatório entre eles.
Obs: O programa será interrompido quando o número 1111 for digitado
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numDigitado, soma = 0;

        boolean flag = true;

        while (flag) {
            System.out.print("Informe um número: ");
            numDigitado = leia.nextInt();
            soma += numDigitado;

            System.out.print("Soma total até agora: " + soma + "\n\n");

            if (numDigitado == 1111){
                flag = false;
            }
        }
        leia.close();
    }
}