/*
39) Faça um algoritmo que mostre na tela a seguinte contagem:
10 9 8 7 6 5 4 3 Acabou!
*/

public class Main {
    public static void main(String[] args) {
        int contador = 10;

        while (contador >= 3) {
            System.out.print(contador + " ");
            contador--;
        }
        System.out.println("Acabou!");
    }
}