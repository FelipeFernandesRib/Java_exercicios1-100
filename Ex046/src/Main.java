/*
46) Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
8 + 10 + 12 + 14 + ... + 98 + 100.
*/

public class Main {
    public static void main(String[] args) {
        int contador = 6;
        int resultado = 0;

        while (contador <= 100) {
            resultado = resultado + contador;
            contador = contador + 2;
        }

        System.out.print(resultado);
    }
}