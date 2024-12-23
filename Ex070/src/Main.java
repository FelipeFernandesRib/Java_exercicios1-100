/*
70) [DESAFIO] Faça um programa que mostre os 10 primeiros elementos da Sequência
de Fibonacci:
1 1 2 3 5 8 13 21...
*/

public class Main {
    public static void main(String[] args) {
        int primeiroValor = 0, segundoValor = 1, aux;
        
        for(int i = 0; i < 10; i++){
            System.out.print(primeiroValor + " ");
            aux = primeiroValor;
            primeiroValor = segundoValor;
            segundoValor = aux + segundoValor;
        }
    }
}