/*
71) Faça um programa que preencha automaticamente um vetor numérico com 8
posições, conforme abaixo:

999 999 999 999 999 999 999 999
0 1 2 3 4 5 6 7

*/

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[8];

        for(int i = 0; i < 8; i++){
            numeros[i] = 999;
        }

        for(int vetor :numeros){
            System.out.println(vetor);
        }
    }
}