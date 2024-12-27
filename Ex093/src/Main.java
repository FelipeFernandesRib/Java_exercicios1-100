/*
93) Faça um programa que tenha um procedimento chamado Contador() que recebe
três valores como parâmetro: o início, o fim e o incremento de uma contagem. O
programa principal deve solicitar a digitação desses valores e passá-los ao
procedimento, que vai mostrar a contagem na tela.

Ex: Para os valores de início (4), fim (20) e incremento(3) teremos
Contador(4, 20, 3) vai mostrar na tela 4 >> 7 >> 10 >> 13 >> 16 >> 19 >> FIM
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe um valor inteiro para ser o inicio da contagem: ");
        int valorInicial = leia.nextInt();

        System.out.print("Informe um valor inteiro para ser o final da contagem: ");
        int valorFinal = leia.nextInt();

        System.out.print("Informe o valor do incremento da contagem: ");
        int incremento = leia.nextInt();
        leia.close();

        Contador(valorInicial, valorFinal, incremento);
    }
    public static void Contador(int valorInicial, int valorFinal, int incremento) {
        String frase = " >> ";
        for(int i = valorInicial; i <= valorFinal; i += incremento){
            System.out.print(i + frase);
        }
        System.out.print("FIM");
    }
}