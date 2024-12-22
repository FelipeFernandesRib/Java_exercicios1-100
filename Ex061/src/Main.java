/*
61) Crie um programa que mostre na tela a seguinte contagem, usando a estrutura
“faça enquanto”
0 3 6 9 12 15 18 21 24 27 30 Acabou!
*/

public class Main {
    public static void main(String[] args) {
        int num = 0;
        do {
            System.out.print(num + " ");
            num += 3;
        } while (num <= 30);
        System.out.print(" Acabou!");
    }
}