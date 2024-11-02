/*
38) Escreva um programa que mostre na tela a seguinte contagem:
6 7 8 9 10 11 Acabou!
*/


public class Main {
    public static void main(String[] args) {
        int contador = 6;

        while (contador <= 11){
            System.out.print(contador + " ");
            contador++;
        }
        System.out.println("Acabou!");
    }
}