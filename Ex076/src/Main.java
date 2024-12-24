/*
76) Crie um programa que preencha automaticamente um vetor numérico com 7
números gerados aleatoriamente pelo computador e depois mostre os valores
gerados na tela.
*/

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int [] num = new int[7];
        Random geraNum = new Random();

        for(int i = 0; i < 7; i++){
            num[i] = geraNum.nextInt(100);
        }

        for(int exibir : num){
            System.out.print(exibir + " ");
        }
    }
}