/*
98) Crie um programa que tenha uma função SuperSomador(), que vai receber dois
números como parâmetro e depois vai retornar a soma de todos os valores no
intervalo entre os valores recebidos.
Ex:
SuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21
SuperSomador(15, 19) vai somar 15 + 16 + 17 + 18 + 19 e vai retornar 85
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe um valor inteiro: ");
        int valor1 = leia.nextInt();

        System.out.print("Informe outro valor inteiro: ");
        int valor2 = leia.nextInt();
        leia.close();

        if(valor2 < valor1){
            int resultado = SuperSomador(valor2, valor1);
            System.out.println("\nSoma de todos os valores no intervalo dos valores informados:\n" + resultado);
        }
        else if(valor1 == valor2){
            System.out.println("\nValores iguais foram informados");
        }
        else{
            int resultado = SuperSomador(valor1, valor2);
            System.out.println("\nSoma de todos os valores no intervalo dos valores informados:\n" + resultado);
        }
    }
    public static int SuperSomador(int n1, int n2){
        int soma = 0;
        for(int i = n1; i <= n2; i++){
            soma += i;
        }
        return soma;
    }
}