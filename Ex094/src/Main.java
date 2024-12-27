/*
94) [DESAFIO] Desenvolva um aplicativo que tenha um procedimento chamado
Fibonacci() que recebe um único valor inteiro como parâmetro, indicando quantos
termos da sequência serão mostrados na tela. O seu procedimento deve receber
esse valor e mostrar a quantidade de elementos solicitados.
Obs: Use os exercícios 70 e 75 para te ajudar na solução
Ex:
Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM
Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34 >> FIM
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe um valor inteiro de quantos termos da sequência de Fibonacci você quer ver: ");
        int numTermos = leia.nextInt();
        leia.close();

        Fibonacci(numTermos);
    }
    public static void Fibonacci(int repeticoes) {
        int primeiroValor = 0, segundoValor = 1, aux;

        for(int i = 0; i < repeticoes; i++){
            System.out.print(primeiroValor + " >> ");
            aux = primeiroValor;
            primeiroValor = segundoValor;
            segundoValor = aux + segundoValor;
        }
        System.out.print("FIM");
    }
}